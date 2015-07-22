package starbucks;

import java.util.Scanner;

public class Starbucks  {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		  인터페이스를 구현한 클래스의 객체 생성문법
		  인터페이스 인스턴스 = new 생성자();
		  
		 * */
		
		Recipe coffee = new Coffee();
		
		
		coffee.boilWater();
		coffee.brew();
		coffee.pourInCup();
		System.out.println("4. 설탕 첨가 여부를 손님에게 묻는다 \n" +
								"(1.무설탕: 블랙  2. 설탕: 밀크) ");
	
		coffee.select(scanner.nextInt());
		coffee.serve();
		Tea tea = new Tea();
		tea.boilWater();
		tea.brew();
		tea.pourInCup();
		System.out.println("4. 레몬,자몽 첨가 여부를 손님에게 묻는다 \n"+
	                                     "(3.레몬 : 레몬티, 4.자몽 : 자몽티)");
		tea.select(scanner.nextInt());
		tea.serve();
	}
}
