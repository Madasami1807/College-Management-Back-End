package com.edubridge.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.entity.Schedule;
import com.edubridge.services.ScheduleService;




@RestController
@RequestMapping("/schedule")
public class RestScheduleController {

	
	@Autowired
	private ScheduleService  scheduleService ;
	
	
	@GetMapping(value="/list")
	public List<Schedule> getAllCourses(){
		return scheduleService.getSchedule();
	}
}
