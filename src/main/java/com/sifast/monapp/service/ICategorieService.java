package com.sifast.monapp.service;

import java.util.List;

import com.sifast.monapp.entities.Categorie;

public interface ICategorieService {

    public Categorie save(Categorie entity);

    public Categorie update(Categorie entity);

    public List<Categorie> findAll();

    public Categorie getById(Long id);

    public void delete(Long id);
}
