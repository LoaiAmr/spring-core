package com.datagearbi.spring.demo.one.annotations;

import org.springframework.stereotype.Component;

/*It use to allow spring to making a scanning */
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day! Welcome in Annotations implementation in HappyFortuneService class...";
	}

}
