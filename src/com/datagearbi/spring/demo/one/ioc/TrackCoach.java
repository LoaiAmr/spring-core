package com.datagearbi.spring.demo.one.ioc;

public class TrackCoach implements Coach {

	// Define a private field for dependency
	FortuneService fortuneService;

	public TrackCoach() {
	}

	// Define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		return "Just Do it " + fortuneService.getFortune();
	}

	// Add an initial bean method
	public void initBean() {
		System.out.println("TrackCoach: inside initial Bean method");
	}

	// Add an destroy bean method
	public void destroyBean() {
		System.out.println("TrackCoach: inside destroy Bean method");
	}

}
