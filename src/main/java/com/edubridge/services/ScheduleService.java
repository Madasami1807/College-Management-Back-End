package com.edubridge.services;


import java.util.List;

import com.edubridge.entity.Schedule;



public interface ScheduleService {

	
	void addSchedule(Schedule schedule);
	
	List<Schedule> getSchedule() ; 
}
