package com.datagearbi.spring.demo.one.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${loai.email}")
	private String email;
	
	@Value("${loai.team}")
	private String team;
	
	
	public SwimCoach(FortuneService fortuneServic) {
		this.fortuneService = fortuneServic;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortuene() {
		return this.fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
	
}
