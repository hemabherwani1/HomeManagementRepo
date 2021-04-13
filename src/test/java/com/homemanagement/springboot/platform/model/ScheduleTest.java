package com.homemanagement.springboot.platform.model;

import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ScheduleTest {


    private Schedule schedule;

    public ScheduleTest() throws ParseException {
    }


    @Test
    public void testSchedule() throws ParseException {

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");

        //start date
        java.util.Date startDate = dateFormatter.parse("2021-04-12");
        java.util.Date startTime = timeFormatter.parse("17:45:00");

        //end date
        java.util.Date endDate = dateFormatter.parse("2021-04-13");
        java.util.Date endTime = timeFormatter.parse("06:00:00");

        String startDatestr = dateFormatter.format(startDate);
        String startTimestr = timeFormatter.format(startTime);

        String endDatestr = dateFormatter.format(endDate);
        String endTimestr = timeFormatter.format(endTime);

        System.out.println("startDatestr ="+startDatestr);
        System.out.println("startTimestr ="+startTimestr);


       java.sql.Date sqlStartDate = Date.valueOf(startDatestr);

        java.sql.Time sqlStartTime = Time.valueOf(startTimestr);

        java.sql.Date sqlEndDate = Date.valueOf(endDatestr);

        java.sql.Time sqlEndTime = Time.valueOf(endTimestr);



        schedule =
        new Schedule("sleep", sqlStartDate, sqlStartTime, sqlEndDate, sqlEndTime ,"daily");

        assertEquals("sleep",schedule.getCategory_Name());
        assertEquals(Date.valueOf("2021-04-12"),schedule.getStart_Date());
        assertEquals(Time.valueOf("17:45:00"),schedule.getStart_Time());
        assertEquals(Date.valueOf("2021-04-13"),schedule.getEnd_Date());
        assertEquals(Time.valueOf("06:00:00"), schedule.getEnd_Time());
        assertEquals("daily",schedule.getFrequency());
    }


}
