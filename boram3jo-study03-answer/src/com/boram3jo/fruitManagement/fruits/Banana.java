package com.boram3jo.fruitManagement.fruits;

public class Banana implements FruitsPrice{

	public Banana() {}
	
	public void print() {
		System.out.println("바나나는 1송이에 " + PRICE + "원 입니다.");
	}
}
