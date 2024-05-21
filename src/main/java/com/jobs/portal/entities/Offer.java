package com.jobs.portal.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Offer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOffer;
    @NotNull
    @Size(min = 3 , max = 20)
    private String nomOffer;
    private String descriptionOffer;
    @NotNull
    private Double prixOffer;
    @ManyToOne
    private Categorie categorieOffer;
    private String localisationOffer;


    @Override
    public String toString() {
        return "Offer{" +
                "idOffer=" + idOffer +
                ", nomOffer='" + nomOffer + '\'' +
                ", descriptionOffer='" + descriptionOffer + '\'' +
                ", prixOffer=" + prixOffer +
                ", categorieOffer=" + categorieOffer +
                ", localisationOffer='" + localisationOffer + '\'' +
                '}';
    }

    public Offer() {
        super();
    }

    public Offer(Long idOffer, String nomOffer, String descriptionOffer, Double prixOffer, Categorie categorieOffer, String localisationOffer) {
        this.idOffer = idOffer;
        this.nomOffer = nomOffer;
        this.descriptionOffer = descriptionOffer;
        this.prixOffer = prixOffer;
        this.categorieOffer = categorieOffer;
        this.localisationOffer = localisationOffer;
    }

    public Long getIdOffer() {
        return idOffer;
    }

    public void setIdOffer(Long idOffer) {
        this.idOffer = idOffer;
    }

    public @NotNull @Size(min = 3, max = 20) String getNomOffer() {
        return nomOffer;
    }

    public void setNomOffer(@NotNull @Size(min = 3, max = 20) String nomOffer) {
        this.nomOffer = nomOffer;
    }

    public String getDescriptionOffer() {
        return descriptionOffer;
    }

    public void setDescriptionOffer(String descriptionOffer) {
        this.descriptionOffer = descriptionOffer;
    }

    public @NotNull Double getPrixOffer() {
        return prixOffer;
    }

    public void setPrixOffer(@NotNull Double prixOffer) {
        this.prixOffer = prixOffer;
    }

    public Categorie getCategorieOffer() {
        return categorieOffer;
    }

    public void setCategorieOffer(Categorie categorieOffer) {
        this.categorieOffer = categorieOffer;
    }

    public String getLocalisationOffer() {
        return localisationOffer;
    }

    public void setLocalisationOffer(String localisationOffer) {
        this.localisationOffer = localisationOffer;
    }
}