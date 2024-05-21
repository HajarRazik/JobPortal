package com.jobs.portal.controllers;

import com.jobs.portal.entities.Offer;
import com.jobs.portal.entities.Categorie;
import com.jobs.portal.services.CategorieServices;
import com.jobs.portal.services.OfferService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OfferController {

    @Autowired
    private OfferService offerService;

    @Autowired
    private CategorieServices categorieServices;

    @RequestMapping("/createOffer")
    public String createOffer(ModelMap modelMap) {
        List<Categorie> categories = categorieServices.getAllCategories();
        modelMap.addAttribute("categories", categories);
        return "CreateOffer";
    }

    @RequestMapping("/saveOffer")
    public String saveOffer(@Valid Offer offer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "CreateOffer";
        } else {
            offerService.saveOffer(offer);
            return "CreateOffer";
        }
    }
    @RequestMapping("/offerList")
    public String OfferList(ModelMap modelMap) {
        List<Offer> productsController = offerService.getAllOffers();
        modelMap.addAttribute( "offersJsp", productsController);
        System.out.printf(String.valueOf(productsController.size()));
        return "offerList";
    }

    @RequestMapping("/deleteOffer")
    public String deleteOffer(@RequestParam("id") Long id , ModelMap modelMap) {
        offerService.deleteOfferById(id);
        List<Offer> productsController = offerService.getAllOffers();
        modelMap.addAttribute( "offersJsp", productsController);
        return "OfferList";
    }
    @RequestMapping("/showOffer")
    public String showOffer(@RequestParam("id") Long id , ModelMap modelMap){
        Offer offerController = offerService.getOfferById(id);
        modelMap.addAttribute("offersJsp", offerController);
        List<Categorie> categorieController = categorieServices.getAllCategories();
        modelMap.addAttribute( "categories", categorieController);
        return "EditOffer";
    }

    @RequestMapping("/updateOffer")
    public String updateOffer(
            @ModelAttribute("offer") Offer offer ,
            ModelMap modelMap
    ) {
        // Retrieve the existing product from the database using its ID
        Offer existingOffer= offerService.getOfferById(offer.getIdOffer());

        // Update the existing product with the new data
        existingOffer.setNomOffer(offer.getNomOffer());
        existingOffer.setPrixOffer(offer.getPrixOffer());
        existingOffer.setCategorieOffer(offer.getCategorieOffer());

        // Save the updated product
        offerService.saveOffer(existingOffer);

        return "redirect:/offerList"; // Redirect to the products list page
    }





}