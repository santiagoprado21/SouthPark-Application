package com.southpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.southpark.domain.Rol;

@Repository
public interface RoleRepository extends JpaRepository<Rol, Long>{
    
}
