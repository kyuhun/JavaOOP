package bank;

import java.util.Scanner;

public class HanaBank {
	public static void main(String[] args) {
		Bank bank = new Bank(100);
		Scanner scanner = new Scanner(System.in);
		int input = 0, key = 0; // 지역변수 초기화
		while (true) {
			System.out.println("1. 계좌개설 2. 개설조회(번호) 3. 계좌조회(이름) "+
		"4. 전체계좌  0. 종료");
			input = scanner.nextInt();
			// 무조건 메소드를 호출하면 이클립스가 자동으로
			// 메소드를 만들어주는 create method 메뉴가 나타나고
			// 그것을 이용해서 새로 메소드를 생성한다.
			key = inputCheck(input,0,5);
			if (input !=0) {
				switch (key) {
				case 1:
					
					System.out.println("고객님 성함 : ");
					String name = scanner.next();
					System.out.println("비밀번호 네자리 입력:");
					int passwd = scanner.nextInt();
					System.out.println("얼마를 입금하시겠습니까?");
					int money = scanner.nextInt();
					bank.openAccount( name, passwd, money);break;
				case 2:
					System.out.println("=== 계좌번호 조회(계좌번호) ===");
					BankBook bankBook = bank.searchAccountByAccountNo(scanner.next());
					System.out.println(bankBook.showAccount());
				
					
					
					break;
				case 3:
					System.out.println("검색하려는 고객명?");
					String serarName = scanner.next();
					int searchCount = bank.searchCountByName(serarName);
					BankBook [] searchArr = new BankBook[searchCount];
					searchArr = bank.searchAccountByName(serarName);
					for(BankBook bankBooks : searchArr)
					{
						System.out.println(bankBooks.showAccount());
					}
					break;
				case 4:
					System.out.println("전체 계좌 조회");
					BankBook [] list = bank.getBankBookList();
					if(bank.getCount()!=0) 
					{
						for (int i = 0; i < bank.getCount(); i++) {
							System.out.println(list[i].showAccount());
						}
					}
					else {
						System.out.println("해당 계좌가 없습니다.");
					}
					break;
				case 5:
					System.out.println("삭제하려는 계좌번호?");
					
					boolean closeOk = bank.closeAccount(scanner.next());
					if (closeOk==true) {
						System.out.println("삭제되었습니다.");
					} else {
						System.out.println("해당 계좌가 없습니다.");
					}

					break;

				default: System.out.println("디폴트 에러발생 !");
					break;
				}
			} else {
				System.out.println("시스템 종료!");
				break; // 무한루프로직에서 시스템 종료 요청시 
					   // 조건에 할당하면 break 처리로 나감
					  // switch case 에서도 동일하게 사용
			}
		}
	}

	private static int inputCheck(int input, int i, int j) {
		if (input < i || input >j) {
			System.out.println("선택메뉴에서 범위값 외의 수를 입력했습니다.");
			return 0; // 시스템 종료 .. 리턴타입의 디폴트값을 리턴했기 때문
		}
		else
		{
			return input;
		}
	
		
	}
}
