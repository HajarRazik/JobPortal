package com.jobs.portal.repositories;

import com.jobs.portal.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepositorie extends JpaRepository<Offer, Long> {

}