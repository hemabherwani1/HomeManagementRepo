package com.homemanagement.springboot.platform.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "Schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int scheduleId;

    @Column(name = "Category_Name")
    private String categoryName;

    @Column(name = "Start_Date")
    private Date startDate;

    @Column(name = "Start_Time")
    private Time startTime;

    @Column(name = "End_Date")
    private Date endDate;

    @Column(name = "End_Time")
    private Time endTime;

    @Column(name = "Frequency")
    private String frequency;


    public Schedule() {

    }

    public Schedule(String categoryName, Date startDate, Time startTime, Date endDate, Time endTime, String frequency) {
        this.categoryName = categoryName;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.frequency = frequency;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Time getEndTime() {
        return endTime;
    }

    public String getFrequency() {
        return frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return scheduleId == schedule.scheduleId && categoryName.equals(schedule.categoryName) && Objects.equals(startDate, schedule.startDate)
                && Objects.equals(startTime, schedule.startTime) && Objects.equals(endDate, schedule.endDate) && Objects.equals(endTime, schedule.endTime) && Objects.equals(frequency, schedule.frequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleId, categoryName, startDate, startTime, endDate, endTime, frequency);
    }
}
