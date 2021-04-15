package com.homemanagement.springboot.platform.repository;

import com.homemanagement.springboot.platform.model.Schedule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Date;
import java.sql.Time;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest

public class HomeManagementRepositoryTest {


    @Autowired
    private ScheduleRepository scheduleRepository;

    @Test
    public void it_should_save_Schedule() {

        Schedule Schedule = new Schedule("sleep", Date.valueOf("2021-04-13"), Time.valueOf("14:00:00"), Date.valueOf("2021-04-13"), Time.valueOf("15:00:00"), "none");
        //schedule = testEntityManager.persistAndFlush(schedule);
        Schedule savedSchedule = scheduleRepository.save(Schedule);
        assertThat(savedSchedule).hasFieldOrPropertyWithValue("categoryName","sleep");
        assertThat(savedSchedule).hasFieldOrPropertyWithValue("startTime",Time.valueOf("14:00:00"));
        assertThat(savedSchedule).hasFieldOrPropertyWithValue("endTime",Time.valueOf("15:00:00"));
        assertThat(savedSchedule).hasFieldOrPropertyWithValue("frequency","none");

    }
}
