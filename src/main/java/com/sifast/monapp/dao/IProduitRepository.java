package com.sifast.monapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sifast.monapp.entities.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Long> {

}
