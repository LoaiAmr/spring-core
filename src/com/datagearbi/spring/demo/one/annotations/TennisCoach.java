package com.datagearbi.spring.demo.one.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



/* It's called the explicit bean id */
//@Component("myCoach") 

/*It's used the default bean id -> the same name of the class with cammelCase -> tennisCoach*/
@Component
public class TennisCoach implements Coach {

	@Autowired // Field injection
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">>TennisCoach: inside default constructor");
	}

	
	public void doMystartupStuff() {
		System.out.println(">>TinnisCoach: inside of doMystartupStuff()");
	}
	
	/*
	 * @Autowired //Constructor injection public TennisCoach(FortuneService
	 * fortuneService) { this.fortuneService = fortuneService; }
	 */

	/*
	 * @Autowired //define a setter method for injection public void
	 * setFortuneService(FortuneService fortuneService) {
	 * System.out.println(">>TennisCoach: inside setFortuneService() method");
	 * this.fortuneService = fortuneService; }
	 */

	/*
	 * @Autowired //define a method injection public void
	 * doSomeStuffCode(FortuneService fortuneService) {
	 * System.out.println(">>TennisCoach: inside doSomeStuffCode() method");
	 * this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice Your backhand volly";
	}

	@Override
	public String getDailyFortuene() {
		return this.fortuneService.getFortune();
	}

}
