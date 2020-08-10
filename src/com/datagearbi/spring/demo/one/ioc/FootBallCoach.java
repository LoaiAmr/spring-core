package com.datagearbi.spring.demo.one.ioc;



public class FootBallCoach implements Coach {

	//Define a private field for dependency
	FortuneService fortuneService;

	//Define a constructor for dependency injection
	public FootBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Training Hard All days :) ";
	}

	@Override
	public String getDailyFortune() {
		//Use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
