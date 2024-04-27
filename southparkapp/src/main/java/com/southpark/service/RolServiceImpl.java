package com.southpark.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.southpark.domain.Rol;

import com.southpark.repository.RolRepository;


@Service
public class RolServiceImpl implements RolService{
	
	
	@Autowired
	private RolRepository rolRepository;

	
	@Override
	public List<Rol> findAll() {
		List<Rol> lstRol = rolRepository.findAll();
		return lstRol;
	}

	@Override
	public Optional<Rol> findBy(String id) {
		return rolRepository.findById(id);
	}

	@Override
	public Rol save(Rol entity) throws Exception {
		return rolRepository.save(entity);
	}

	@Override
	public Rol update(Rol entity) throws Exception {
		return rolRepository.save(entity);
	}

	@Override
	public void delete(Rol entity) throws Exception {
		rolRepository.delete(entity);		
	}

	@Override
	public void deleteById(String id) throws Exception {
		rolRepository.deleteById(id);
	}

	@Override
	public void validate(Rol entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		return rolRepository.count();
	}

}
