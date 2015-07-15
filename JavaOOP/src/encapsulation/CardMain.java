package encapsulation;


import java.util.Scanner;

public class CardMain {
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
		// 인터넷을 망을 타고 데이터값이 게임회사 들어옴
		CardBean3 hong = new CardBean3(name1);
		CardBean3 kim = new  CardBean3(name2);
		CardGame game = new CardGame(hong,kim);
		System.out.println(hong.getName1()+":"+ hong.getNum2());
		System.out.println(kim.getName1()+":"+kim.getNum2());
		// 사용자가 결과화면을 보는 중.. 
		System.out.println(game.getWinner());
	}
}
