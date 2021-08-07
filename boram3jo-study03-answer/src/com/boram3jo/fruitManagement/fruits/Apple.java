package com.boram3jo.fruitManagement.fruits;

public class Apple implements FruitsPrice{
	
	public Apple(){};
	
	public void print() {
		System.out.println("사과는 5개에 " + PRICE + "원 입니다.");
	}
}
