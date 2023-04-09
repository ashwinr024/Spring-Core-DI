package com.a.DI;

import java.util.Random;

public class RandomFortune implements fortuneservice {

	private String d[]= {
	"Hello","hi","How are you"
	};
	private Random ran=new Random();
	public String getFotune() {
		// TODO Auto-generated method stub
		int i=ran.nextInt(d.length);
		return d[i];
	}

}
