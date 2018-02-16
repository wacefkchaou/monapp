package com.sifast.monapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sifast.monapp.dao.ICategorieDao;
import com.sifast.monapp.entities.Categorie;
import com.sifast.monapp.service.ICategorieService;

@Service
public class CategorieService implements ICategorieService {

    @Autowired
    private ICategorieDao categoriedao;

    @Override
    public Categorie save(Categorie p) {

        return categoriedao.save(p);
    }

    @Override
    public Categorie update(Categorie p) {
        return categoriedao.update(p);
    }

    @Override
    public List<Categorie> findAll() {
        return categoriedao.findAll();
    }

    @Override
    public Categorie getById(Long id) {
        return categoriedao.getById(id);
    }

    @Override
    public void delete(Long id) {
        categoriedao.delete(id);
    }

}
