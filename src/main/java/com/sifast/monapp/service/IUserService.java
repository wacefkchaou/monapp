package com.sifast.monapp.service;

import java.util.List;

import com.sifast.monapp.entities.User;

public interface IUserService {

    public User save(User entity);

    public User update(User entity);

    public List<User> findAll();

    public User getById(Long id);

    public void delete(Long id);

}
