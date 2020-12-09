package com.abcinterport.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abcinterport.entity.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
