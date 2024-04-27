package com.southpark.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.southpark.domain.User;

import com.southpark.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		List<User> lstUser = userRepository.findAll();
		return lstUser;
	}

	@Override
	public Optional<User> findBy(String id) {
		return userRepository.findById(id);
	}

	@Override
	public User save(User entity) throws Exception {
		return userRepository.save(entity);
	}

	@Override
	public User update(User entity) throws Exception {
		return userRepository.save(entity);
	}

	@Override
	public void delete(User entity) throws Exception {
		userRepository.delete(entity);
	}

	@Override
	public void deleteById(String id) throws Exception {
		userRepository.deleteById(id);
	}

	@Override
	public void validate(User entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		return userRepository.count();
	}

}
