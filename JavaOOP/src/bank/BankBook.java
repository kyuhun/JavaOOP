package bank;

public class BankBook implements Account{

	public static  String BANK;
	private int bankbookNo;
	private String name;
	private int money,pass;
	private String msg; // 유효성 체크 결과를 알려줘서 고객이 만약
						// 실수로 그렇게 입력햇다면 공지해주는 기능
	public BankBook(String name) {
			this.BANK=  "아이티 뱅크";
			this.bankbookNo = (int) (Math.random()*99999+10000);
			// Math.random()*[end]+[start]
			this.name =name;
			
	}							
		// 개발자는 setter 를 쓸지, 생성자로 끝낼지 고민
	    // getter, setter 단축키 : ALT + SHIFT + S
	      // 4줄을 한꺼번에 주석 단축키 : CTRL + SHIFT + /
	/*====== 멤버메소드  ======*/
	@Override
	public String toString() {
		String str = "";
		str =  " ============== \n"+
                 "    ["+BANK+"]   \n"+
                 "  계좌번호 : "+bankbookNo+" \n" +
                 "    이 름: "+name+"     \n"+
                 "    잔액 : "+money+"원    \n"+
                  " ==============";
		return str;
	}
	public int getPass() {
		return pass;
	}
	public int getBankbookNo() {
		return bankbookNo;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	
	public void setPass(int pass) {
		this.pass = pass;
	}
	
	@Override
	public void withdraw(int money) {
		// 파라미터 값이 정상값이 아닌 상태를 
		// 추적해서 필터링하는 로직이 필요해짐.
		// ==> 유효성체크
		if (money<=0) {
			this.msg = "출금액은 0보다 커야 합니다.";
		} else if(this.money< money){
			msg = "출금액이 전액보다 큽니다.";
		}
		else{
			this.money -= money;
		}
		
	}
	@Override
	public void deposit(int money) {
		if (money<=0) {
			this.msg = "출금액은 0보다 커야 합니다.";
		} else {
			this.money += money; // 누적된 값에서 마이너스
		}
		
	}
	
}
