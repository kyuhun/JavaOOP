package inhebitance;

import java.util.Scanner;

public class IphoneMain {
	public static void main(String[] args) {
		/*
		 [콘솔 출력문]
		아이폰을 사용해서 
		 폰을 가지고 다닐수 있음
		 홍길동에게 데이터를 전달
		 * */
		Iphone iphone = new Iphone();
		Scanner scanner = new Scanner(System.in);	
		/*
		 클래스명.필드명 ... get/set 없이 사용하는 이유는 
		 은닉화가 필요없는 고정된 값이기 때문이다.
		 Iphone.BRAND 식으로 사용해야한다.
		 * */
		

		iphone.setCompany(Iphone.BRAND);
				// 아이폰이 출력되게 하려면 
				// 클래스변수(* 스태틱 변수)는
				// 클래스이름.BRAND 로 가져오면 됩니다.
				// iphone.setCompany(Iphone.BRAND);
		iphone.setPortable(Iphone.TRUE); // 무조건 애플은 이동전화만 만든다.
		System.out.println(" 통화 상대 입력:");
		String name = scanner.next();
		iphone.setCall(name);
		System.out.println("보내는 메시지 입력:");
		iphone.setDate(name, scanner.next());
		// 기존에 자동생성된 set을 파라미터가 2개인 메소드로 변형
		System.out.println(iphone.getCompany()+"를 사용해서 .....");
		System.out.println(iphone.getMove());
		System.out.println(iphone.getCall());
		System.out.println(iphone.getDate());
	
	}
}
