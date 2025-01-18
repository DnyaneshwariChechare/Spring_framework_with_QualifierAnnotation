package com.tka;

import org.springframework.stereotype.Component;

@Component("Airtel")
public class Airtel implements Sim {

	@Override
	public String calling() {
		// TODO Auto-generated method stub
		return "you are calling from airtel";
	}

}
