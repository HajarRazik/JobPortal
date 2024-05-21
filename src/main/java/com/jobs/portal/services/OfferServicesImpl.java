package com.jobs.portal.services;


import com.jobs.portal.entities.Offer;
import com.jobs.portal.repositories.OfferRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Add @Service annotation to declare it as a Spring-managed service
public class OfferServicesImpl implements OfferService {
    @Autowired
    OfferRepositorie serviceRepository;
    @Override
    public Offer saveOffer(Offer offer) {
        return serviceRepository.save(offer);
    }

    @Override
    public Offer updateOffer(Offer service) {
        return serviceRepository.save(service);
    }

    @Override
    public Offer getOfferById(Long id) {
        return serviceRepository.findById(id).get();
    }

    @Override
    public List<Offer> getAllOffers() {
        return serviceRepository.findAll();
    }


    @Override
    public void deleteOfferById(Long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public void deleteAllOffers() {
        serviceRepository.deleteAll();
    }


}