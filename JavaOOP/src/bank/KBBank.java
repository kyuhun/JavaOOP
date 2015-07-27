package bank;

import java.util.Scanner;

public class KBBank {
	public static void main(String[] args) {
		BankRole bank = new Bank(100); 
		// 인터페이스타입 인스턴스 = new 생성자();
		Scanner scanner = new Scanner(System.in);
		System.out.println("고객님 성함 : ");
		String name = scanner.next();
		System.out.println("비밀번호 네자리 입력:");
		int passwd = scanner.nextInt();
		System.out.println("얼마를 입금하시겠습니까?");
		int money = scanner.nextInt();
		bank.openAccount( name, passwd, money);
		System.out.println("=== 계좌번호 조회(계좌번호) ===");
		System.out.println("검색하려는 고객명?");
		String serarName = scanner.next();
		int searchCount = bank.searchCountByName(serarName);
		BankBook [] searchArr = new BankBook[searchCount];
		searchArr = bank.searchAccountByName(serarName);
		for(BankBook bankBook : searchArr)
		{
			System.out.println(bankBook.showAccount());
		}
		
		System.out.println("검색하려는 계좌번호?");
		// 객체가 메소드를 호출한 후 연산을 통해 결과를 리턴하였지만 
		// 그 리턴값을 받는 변수처리는 개발자가 별도로 해줘야 한다.
		// 그 방법은 메소드가 리턴하는 리턴타입을 알아내서 
		// 그 타입으로 변수하나를 만든 다음 그 변수에 리턴값을 할당한다.
		BankBook bankBook = bank.searchAccountByAccountNo(scanner.next());
		System.out.println(bankBook.showAccount());
		System.out.println("삭제하려는 계좌번호?");
		// int와 String 의 값을 서로 비교하려면 String 타입을 int로 바꿔줘야야 한다.
		// int one = String.valueOf("12345"); 의 결과값은 one =12345;
		// String delet = scanner.next();
		// String deletAccount = String.valueOf(delet);
		boolean closeOk = bank.closeAccount(scanner.next());
		if (closeOk==true) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("해당 계좌가 없습니다.");
		}
	}
}
