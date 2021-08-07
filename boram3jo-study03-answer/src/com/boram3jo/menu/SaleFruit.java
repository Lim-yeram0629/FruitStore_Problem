package com.boram3jo.menu;

import com.boram3jo.fruitManagement.fruits.Apple;

public class SaleFruit extends Apple{
	
	public SaleFruit() {}
	
	@Override
	public void print() {
		super.print();
		System.out.println("잠깐! 사과는 세일 중이라 8개 가져가세요~");
	}

}
