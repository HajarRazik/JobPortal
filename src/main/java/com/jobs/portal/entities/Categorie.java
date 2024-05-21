
package com.jobs.portal.entities;
import com.jobs.portal.entities.Categorie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categorie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategorie;
    private String nomCategorie;
    @OneToMany(mappedBy = "categorieOffer")
    private List<Offer> Offers;

    @Override
    public String toString() {
        return "Categorie{" +
                "idCategorie=" + idCategorie +
                ", nomCategorie='" + nomCategorie + '\'' +
                ", Offers=" + Offers +
                '}';
    }

    public Categorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public Long getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public List<Offer> getOffers() {
        return Offers;
    }

    public void setOffers(List<Offer> Offers) {
        this.Offers = Offers;
    }
}