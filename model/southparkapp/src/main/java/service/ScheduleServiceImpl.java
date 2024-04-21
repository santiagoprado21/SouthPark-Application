
package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.southpark.domain.ActivityDetails;
import com.southpark.domain.Schedule;

import repository.ActivityDetailsRepository;
import repository.ScheduleRepository;

public class ScheduleServiceImpl implements ScheduleService{

	@Autowired
	private ScheduleRepository scheduleRepository;
	
	@Override
	public List<Schedule> findAll() {
		List<Schedule> lstSchedule = scheduleRepository.findAll();
		return lstSchedule;
	}

	@Override
	public Optional<Schedule> findBy(String id) {
		return scheduleRepository.findById(id);
	}

	@Override
	public Schedule save(Schedule entity) throws Exception {
		return scheduleRepository.save(entity);
	}

	@Override
	public Schedule update(Schedule entity) throws Exception {
		return scheduleRepository.save(entity);
	}

	@Override
	public void delete(Schedule entity) throws Exception {
		scheduleRepository.delete(entity);
	}

	@Override
	public void deleteById(String id) throws Exception {
		scheduleRepository.deleteById(id);
	}

	@Override
	public void validate(Schedule entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		return scheduleRepository.count();
	}

}
