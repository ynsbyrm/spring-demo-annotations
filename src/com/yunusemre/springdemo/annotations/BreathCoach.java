package com.yunusemre.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component()
public class BreathCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Keep your breath 1 min x 3";
	}
	
}
