package encapsulation;

public class PayBean {
	// 메소드는 선언부, 연산부, 출력부 이렇게 나누고 
	// Bean 클래스라면 멤버 필드 + 멤버 메소드
	//name salary tax money
	private String name; // 멤버필드 변수는 초기화를 하지않는다.
	private int salary;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	// get 계산을 해서 toString으로 통해 출력할때 
	// set 입력을 받을 때
	public int getTax() {
		int tax =0;
		tax = (int) salary / 10;
		return tax ;
	}
	/*
	 this 는 이 클래스 내부에 있는 ~~~ 의미
	 * */
	public int getMoney() {
		int money =0;
		money = salary - this.getTax();
		return money;
	}
	// 멤버메소드 영역이 시작
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " ["+this.name+" 실급여]\n"+ 
        " 월급 : "+this.salary+"만원\n"+ 
      	"세금 : "+this.getTax()+"만원\n"+
		"실급여 : "+this.getMoney()+"만원";
	}
}



