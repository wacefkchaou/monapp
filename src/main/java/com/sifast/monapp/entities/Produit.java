package com.sifast.monapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Produit implements Serializable {

    @Id
    @GeneratedValue
    private Long idProduit;

    @NotEmpty
    private String designation;

    private String description;

    private double prix;

    private int quantité;

    @ManyToOne
    @JoinColumn(name = "ID_CAT")
    private Categorie categorie;

    public Produit() {
        super();
    }

    public Produit(String designation, String description, double prix, int quantité) {
        super();
        this.designation = designation;
        this.description = description;
        this.prix = prix;
        this.quantité = quantité;

    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    // public Categorie getCategorie() {
    // return categorie;
    // }
    //
    // public void setCategorie(Categorie categorie) {
    // this.categorie = categorie;
    // }

}
