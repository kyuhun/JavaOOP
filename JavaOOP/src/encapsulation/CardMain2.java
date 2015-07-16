package encapsulation;


import java.util.Scanner;

public class CardMain2 {
	public static void main(String[] args) {
		/*
		 [오더]
		 카드 두장을 비교해서 카드 번호가 
		 더 큰 수가 이기는 게임프로그램을 작성하시오
		 일단, 프로토타입(시제품) 프로그램으로 
		 개발자가 임의의 숫자를 입력하면
		 [출력]
		 [홍길동 : 7] vs [김유신 : 4]
		 	홍길동 승리
		 
		 * */
		
		String  name1 = "", name2 ="";
		int num1 =0, num2=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name1 = scanner.next();
	
		System.out.println("이름을 입력하세요");
		name2 = scanner.next();
		
		
		// 객체를 생성함

		CardBean cardBean = new CardBean();
		// 스캐너가 받아 놓은 값은 현재 지변에 있다.
		// 그런데 연산로직은 객체에 있다.
		// 따라서, 지변에 있는 값을 멤변에 던져야 한다.
		CardGame game = new CardGame();
		cardBean.setName1(name1);
		cardBean.setNum1(num1); // 스캐너로 받지 않는다고 
							// setNum()를 호출(사용)하지 않으면
							// 랜덤 숫자가 발생하지 않는다.
		cardBean.setName2(name2);
		cardBean.setNum2(num2);
		
		
		System.out.println(game.toString());
		
	}
}
