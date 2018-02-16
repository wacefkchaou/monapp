package com.sifast.monapp.service;

import java.util.List;

import com.sifast.monapp.entities.Produit;

public interface IProduitService {

    public Produit save(Produit entity);

    public Produit update(Produit entity);

    public List<Produit> findAll();

    public Produit getById(Long id);

    public void delete(Long id);
}
