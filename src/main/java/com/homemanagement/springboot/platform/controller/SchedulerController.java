package com.homemanagement.springboot.platform.controller;

import com.homemanagement.springboot.platform.model.Schedule;
import com.homemanagement.springboot.platform.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class SchedulerController {

    @Autowired
    ScheduleRepository scheduleRepository;

    @PostMapping(path="/homemanagement/schedule")
    public ResponseEntity<Object> createSchedule(@RequestBody Schedule schedule) {
        scheduleRepository.save(schedule);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

}
