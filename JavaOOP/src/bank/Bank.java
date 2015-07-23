package bank;



public class Bank implements BankRole{
	// 필드
	// 은행은 통장을 여러개를 관리한다.
	// 따라서 필드에 인스턴스변수 하나를 지정하지 않고
	// 여러개를 담을 수 있는 배열을 지정한다.
	// 아래 배열은 은행에서보면 계좌를 관리하는 DB
	private BankBook [] bankBookList; 
	private int count; // 은행에서 관리하는 통장 갯수
	// 생성자
	// 배열,자료구조(컬렉션)을 보유하는 
	// 객체를 만들고자 할 때는 그 객체의 
	// 생성자에 배열,자료구조의 객체를 생성해준다
	public Bank(int count) {
		bankBookList = new BankBook[count];
	}
	// 멤버메소드
	// 계좌 개설
	/*
	  계좌번호, 계좌주 , 비번 , 진액 만 입력하면 
	  통장을 만들어준다.
	 * */
	
	
	
	
	// 계좌개설 
	@Override
	public void openAccount( String ownerName,int  password, int restMoney) {
		BankBook bankBook =   new BankBook(ownerName);
		bankBook.setPass(password);
		bankBook.deposit(restMoney);
		// 통장을 개설하자마자 은쟁정산 DB에 통장정보 저장 개념
		bankBookList[count] = (BankBook) bankBook;
		this.count++; // 전체 은행에 개설된 통장 갯수 1증가
		
	}
	// 계좌 검색 (계좌번호) -> 리턴결과: 계좌 1개
	@Override
	public BankBook searchAccountByAccountNo(String accountNo) 
	{
		// String -> int 
		int searchAccountNo = Integer.parseInt(accountNo);
		BankBook account = null; 
		for (int i = 0; i < this.count; i++) {
			/*
			  문자타입(String) 서로 같은지 여부 .equals()
			  숫자타입(int) 서로 같은지 여부 ==
			 * */
			
			if (bankBookList[i].getBankbookNo()==searchAccountNo) {
			account =  bankBookList[i];
			}
		}
		
		return account; 
		}
			
	
	// 계좌검색(이름) -> 리턴결과 : 계좌 여러개
	@Override
	public BankBook[] searchAccountByName(String ownerName) {
		
			BankBook[] accounts = null;
			int tempcount = this.searchCountByName(ownerName);
	if (tempcount == 0) {
		return null;
		
		
	}	
	for (int i = 0; i < this.count; i++) {
		if (bankBookList[i].getName().equals(ownerName)) {
			accounts[tempcount] = bankBookList[i];
			tempcount ++;
		}
		
	}
		return accounts;
	}
		
	
	// 계좌검색(이름) -> 리턴결과 : 숫자
	@Override
	public int searchCountByName(String name) {
		int  count = 0;
		
		for (int i = 0; i < bankBookList.length; i++) {
			if(bankBookList[i].getName().equals(name)){
				count ++;
			}
		}
		return count;
	}
	// 계좌해지  -> 리턴결과 : true or false
	@Override
	public boolean closeAccount(String accountNo) {
		// flag은 삭제가 성공적으로 이루어지면  true 리턴하고,
		// 삭제할 게 없으면 false 리턴 
		boolean flag = false;
		// String(문자열)로 들어온 값을 숫자로 바꿔서 비교
		int searchAccountNo = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count;i++) {
			if (bankBookList[i].getBankbookNo()==searchAccountNo) {
				flag = true;
			/*
			 j=i 로 바꾼 이유는
			 홍길동의 계좌가 은행 전체계좌의 50번째 라면 .. 
			 내부 for 문에서 다시 처음 0부터 회전하지 않고
			 홍길동의 계좌가 있는 인덱스 번호부터 
			 뒤에 있는 계좌번호를 덮어쓰는 방식으로 진행한 후 
			 맨 마지막 인덱스번호를 제거하면 은행에서 전체계좌가
			 100개가 있는 상황이라면 홍길동이 삭제된 후 전체계좌수는
			 99개가 될것이다. 그래서 this.count-1을 해주었음.
			 * */
				for (int j = i; j < this.count-1; j++) {
					bankBookList[i] = bankBookList[j+1];
				}
				count --;
			}
		}
		
		return flag;
	}
	/*
	  만들어진 통장을 고객에 주는 기능 = 생성 결과를 보여준다.
	 * */

}
