package com.jobs.portal.repositories;

import com.jobs.portal.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepositorie extends JpaRepository<Categorie, Long> {
}