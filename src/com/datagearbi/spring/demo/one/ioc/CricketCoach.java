package com.datagearbi.spring.demo.one.ioc;

public class CricketCoach implements Coach {

	// Add new fields for email and team
	private String email;
	private String team;
	private FortuneService fortuneService;

	// Create a no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket Coach: inside no-arg constructor");
	}

	public void setEmail(String email) {
		System.out.println("Cricket Coach: inside setter method using - setEmail -> " + email);
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside setter method using - setTeam -> " + team);
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	// Our setter method using to setter injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method using - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
