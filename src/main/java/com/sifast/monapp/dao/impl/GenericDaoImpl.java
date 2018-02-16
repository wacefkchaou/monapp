package com.sifast.monapp.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.sifast.monapp.dao.IGenericDao;

@SuppressWarnings("unchecked")
public class GenericDaoImpl<E> implements IGenericDao<E> {

    @PersistenceContext
    private EntityManager em;

    private Class<E> type;

    public GenericDaoImpl() {

        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class<E>) pt.getActualTypeArguments()[0];

    }

    @Override
    public E save(E entity) {
        em.persist(entity);
        return entity;

    }

    @Override
    public E update(E entity) {

        return em.merge(entity);

    }

    @Override
    public List<E> findAll() {
        Query query = em.createQuery("select t from " + type.getSimpleName() + " t");
        return query.getResultList();
    }

    @Override
    public E getById(Long id) {
        return em.find(type, id);
    }

    @Override
    public void delete(Long id) {
        E tab = em.getReference(type, id);
        em.remove(tab);
    }

}
