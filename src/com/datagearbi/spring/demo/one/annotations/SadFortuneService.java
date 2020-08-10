package com.datagearbi.spring.demo.one.annotations;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is a sad day";
	}

}
