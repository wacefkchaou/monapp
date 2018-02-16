package com.sifast.monapp.dao;

import java.util.List;

public interface IGenericDao<E> {

    public E save(E entity);

    public E update(E entity);

    public List<E> findAll();

    public E getById(Long id);

    public void delete(Long id);

}
