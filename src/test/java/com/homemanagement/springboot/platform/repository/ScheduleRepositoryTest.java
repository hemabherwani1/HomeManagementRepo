package com.homemanagement.springboot.platform.repository;

import com.homemanagement.springboot.platform.mapper.ScheduleMapper;
import com.homemanagement.springboot.platform.model.Schedule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest

public class ScheduleRepositoryTest {


    @Autowired
    private ScheduleRepository scheduleRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void it_should_save_Schedule() {

        Schedule schedule = new Schedule("sleep", Date.valueOf("2021-04-13"), Time.valueOf("14:00:00"), Date.valueOf("2021-04-13"), Time.valueOf("15:00:00"), "none");

        Schedule savedSchedule = scheduleRepository.save(schedule);

        Schedule schedule1 =  jdbcTemplate.queryForObject("Select * from schedule",new ScheduleMapper());

        assertEquals(savedSchedule.getCategoryName(), schedule1.getCategoryName());

        assertEquals();


    }


}
