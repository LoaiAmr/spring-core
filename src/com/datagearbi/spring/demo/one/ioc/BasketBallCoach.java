package com.datagearbi.spring.demo.one.ioc;

public class BasketBallCoach implements Coach {

	// Define a private field for dependency
	FortuneService fortuneService;

	// Define a constructor for dependency injection
	public BasketBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
