package com.jobs.portal.services;

import com.jobs.portal.entities.Categorie;
import com.jobs.portal.repositories.CategorieRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServicesImpl implements CategorieServices {

    @Autowired
    private CategorieRepositorie categorieRepositorie;

    @Override
    public List<Categorie> getAllCategories() {
        return categorieRepositorie.findAll();
    }

    @Override
    public Categorie saveCategorie(Categorie categorie) {
        return categorieRepositorie.save(categorie);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categorieRepositorie.deleteById(id);
    }

    @Override
    public Categorie getCategorieById(Long id) {
        return categorieRepositorie.findById(id).get();
    }

    @Override
    public Categorie updateCategorie(Categorie categorie) {
        return categorieRepositorie.save(categorie);
    }
}