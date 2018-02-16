package com.sifast.monapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sifast.monapp.dao.IProduitDao;
import com.sifast.monapp.entities.Produit;
import com.sifast.monapp.service.IProduitService;

@Service
public class ProduitService implements IProduitService {

    @Autowired
    private IProduitDao produitdao;

    @Override
    public Produit save(Produit p) {

        return produitdao.save(p);
    }

    @Override
    public Produit update(Produit p) {
        return produitdao.update(p);
    }

    @Override
    public List<Produit> findAll() {
        return produitdao.findAll();
    }

    @Override
    public Produit getById(Long id) {
        return produitdao.getById(id);
    }

    @Override
    public void delete(Long id) {
        produitdao.delete(id);
    }

}
