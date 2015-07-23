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
			bankBook.showAccount();
		}
		
		System.out.println("검색하려는 계좌번호?");
	
		bank.searchAccountByAccountNo(scanner.next()).showAccount();
		
	}
}
