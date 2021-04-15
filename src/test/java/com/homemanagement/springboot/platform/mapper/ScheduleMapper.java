package com.homemanagement.springboot.platform.mapper;

import com.homemanagement.springboot.platform.model.Schedule;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ScheduleMapper implements RowMapper<Schedule> {
    @Override
    public Schedule mapRow(ResultSet rs, int rowNum) throws SQLException {
        Schedule schedule = new Schedule(rs.getString("Category_Name"),
                rs.getDate("Start_Date"),
                rs.getTime("Start_Time"),
                rs.getDate("End_Date"),
                rs.getTime("End_Time"),
                rs.getString("Frequency")

                );
        return schedule;
    }
}
