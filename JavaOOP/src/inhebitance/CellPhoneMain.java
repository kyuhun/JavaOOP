package inhebitance;

import java.util.Scanner;

public class CellPhoneMain {
	public static void main(String[] args) {
		CellPhone nokia = new CellPhone();
		Scanner scanner = new Scanner(System.in);	
		nokia.setCompany("노키아 휴대전화");
		System.out.println("전화 걸 사람:");
		nokia.setCall(scanner.next());
		// boolean 타입 set 메소드를 이용하여 
		// setMove 를 자동 설정하게끔 유도하고
		// getMove()를 호출하게 하는 패턴
		nokia.setPortable(true);
		System.out.println(nokia.getCompany()+"를 사용해서 .....");
		System.out.println(nokia.getMove());
		System.out.println(nokia.getCall());
		/*
		 [콘솔 출력문]
		 노키아 휴대전화를 사용해서 
		 폰을 가지고 다닐수 있음
		 홍길동에게 전화를 검
		 * */
	}
}
