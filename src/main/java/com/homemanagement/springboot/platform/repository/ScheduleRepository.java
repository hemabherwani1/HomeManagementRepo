package com.homemanagement.springboot.platform.repository;

import com.homemanagement.springboot.platform.model.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

}

//@Repository
//public class ScheduleRepository {
//    public Schedule save(Schedule schedule) {
//        return schedule;
//    }
//}