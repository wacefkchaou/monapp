package com.sifast.monapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categorie implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long idCategorie;

    private String nomCategorie;

    private String description;

    // @OneToMany(mappedBy = "categorie")
    // private Collection<Produit> produits;

    public Categorie() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Categorie(String nomCategorie, String description) {
        super();
        this.nomCategorie = nomCategorie;
        this.description = description;

    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // public Collection<Produit> getProduits() {
    // return produits;
    // }
    //
    // public void setProduits(Collection<Produit> produits) {
    // this.produits = produits;
    // }

}
