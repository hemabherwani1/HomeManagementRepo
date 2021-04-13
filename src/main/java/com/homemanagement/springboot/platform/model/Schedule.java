package com.homemanagement.springboot.platform.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "Schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Schedule_Id;

    @Column(name = "Category_Name")
    private String category_Name;

    @Column(name = "Start_Date")
    private Date start_Date;

    @Column(name = "Start_Time")
    private Time start_Time;

    @Column(name = "End_Date")
    private Date end_Date;

    @Column(name = "End_Time")
    private Time end_Time;

    @Column(name = "Frequency")
    private String frequency;


    public Schedule(String category_Name, Date startDate, Time startTime, Date endDate, Time endTime, String frequency) {
        this.category_Name = category_Name;
        this.start_Date = startDate;
        this.end_Date = endDate;
        this.start_Time = startTime;
        this.end_Time = endTime;
        this.frequency = frequency;
    }

    public Schedule() {

    }

    public int getSchedule_Id() {
        return Schedule_Id;
    }

    public String getCategory_Name() {
        return category_Name;
    }

    public Date getStart_Date() {
        return start_Date;
    }

    public Time getStart_Time() {
        return start_Time;
    }

    public Date getEnd_Date() {
        return end_Date;
    }

    public Time getEnd_Time() {
        return end_Time;
    }

    public String getFrequency() {
        return frequency;
    }
}
