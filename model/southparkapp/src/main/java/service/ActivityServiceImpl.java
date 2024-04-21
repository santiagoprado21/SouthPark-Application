package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.southpark.domain.Activity;

import repository.ActivityDetailsRepository;
import repository.ActivityRepository;

public class ActivityServiceImpl implements ActivityService{

	
	@Autowired
	private ActivityRepository activityRepository;
	
	
	@Override
	public List<Activity> findAll() {
		List<Activity> lstActivity = activityRepository.findAll();
		return lstActivity;
	}

	@Override
	public Optional<Activity> findBy(String id) {
		return activityRepository.findById(id);
	}

	@Override
	public Activity save(Activity entity) throws Exception {
		return activityRepository.save(entity);
	}

	@Override
	public Activity update(Activity entity) throws Exception {
		return activityRepository.save(entity);
	}

	@Override
	public void delete(Activity entity) throws Exception {
		activityRepository.delete(entity);
	}

	@Override
	public void validate(Activity entity) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public Long count() {
		return activityRepository.count();
	}

	@Override
	public void deleteById(String id) throws Exception {
		activityRepository.deleteById(id);
	}

}
