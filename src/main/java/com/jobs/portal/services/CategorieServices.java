package com.jobs.portal.services;

import com.jobs.portal.entities.Categorie;

import java.util.List;

public interface CategorieServices {
    List<Categorie> getAllCategories();

    Categorie saveCategorie(Categorie categorie);

    void deleteCategoryById(Long id);

    Categorie getCategorieById(Long id);

    Categorie updateCategorie(Categorie categorie);
}