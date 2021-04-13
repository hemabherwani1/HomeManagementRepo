package com.homemanagement.springboot.platform.repository;

import com.homemanagement.springboot.platform.model.Schedule;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

}
