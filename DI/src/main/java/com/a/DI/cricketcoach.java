package com.a.DI;

public class cricketcoach implements Coach {
	private fortuneservice fortuneservice;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public cricketcoach()
	{
		
	}
public void setfortuneservice(fortuneservice fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	//	public cricketcoach(fortuneservice fortuneservice)
//	{
//		this.fortuneservice=fortuneservice;
//	}
	public String getCoach() {
		// TODO Auto-generated method stub
		return "Play defencive shots";
	}

	public String getFotune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFotune();
	}
	public void ema()
	{
		System.out.println(this.email);
	}
	
}
