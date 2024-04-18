package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.southpark.domain.ActivityDetails;
import com.southpark.domain.User;

import repository.UserRepository;

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
