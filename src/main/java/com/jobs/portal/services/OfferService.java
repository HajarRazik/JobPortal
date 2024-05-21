package com.jobs.portal.services;


import com.jobs.portal.entities.Offer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OfferService {
    Offer updateOffer(Offer offer);

    void    deleteOfferById(Long id);
    void    deleteAllOffers();

    Offer saveOffer(Offer offer);


    List<Offer> getAllOffers();

    Offer getOfferById(Long id);
}