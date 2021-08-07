package com.boram3jo.menu;

import java.util.Scanner;

import com.boram3jo.fruitManagement.fruits.Banana;
import com.boram3jo.fruitManagement.fruits.FruitsPrice;
import com.boram3jo.fruitManagement.fruits.Orange;

public class SelectFruit {
	
	public SelectFruit() {}

	public static void selectMenu() {
		
		Scanner sc = new Scanner(System.in);
		FruitsPrice fruit;
		SaleFruit saleFruit = new SaleFruit();
		
		while(true) {
			System.out.println("==== 5000원 과일 상점 ====");
			System.out.println("1. 사과 \n2. 바나나 \n3. 오렌지 \n9. 상점 나가기");		
			System.out.print("원하시는 과일의 번호를 선택해 주세요 : ");
			int number = sc.nextInt();
			
			switch(number) {
			case 1 : 
				saleFruit = new SaleFruit(); 
				saleFruit.print();
				break;
			case 2: 
				fruit = new Banana();
				fruit.print();
				break;
			case 3: 
				fruit = new Orange();
				fruit.print();
				break;
			case 9:
				System.out.println("안녕히가세요~");
				sc.close();
				return;
			default:	
				System.out.println("저희 가게에는 그런 과일이 없습니다ㅠㅠ");
				System.out.println("메뉴를 다시 보시겠어요?");
				break;
			}
			
		}
	}
}
