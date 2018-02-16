package com.sifast.monapp.service;

import java.util.List;

import com.sifast.monapp.entities.Role;

public interface IRoleService {

    public Role save(Role entity);

    public Role update(Role entity);

    public List<Role> findAll();

    public Role getById(Long id);

    public void delete(Long id);

}
