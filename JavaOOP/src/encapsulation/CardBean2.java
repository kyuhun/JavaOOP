package encapsulation;



public class CardBean2 {

	private String name1,name2;
	private int num1,num2;
		
	public void setName1(String name1) {
		// ()안에 값을 파라미터하고 소속은 지변
		
		this.name1 = name1;
		// this.name1 은 인스턴스 변수 이고 
		// = name1 은 파라미터로 넘어온 지변 ( 스캐너가 받은 값)
		// 스캐너가 받아 논 값을 가진 지변 값을 
		// 멤변 name1에 할당하라.
		// 파라미터값과 멤변값의 이름은 달라도 상관없다.
		// 단, 데이터타입(String, int )은 반드시 일치해야한다.
	}
		public void setName2(String name2) {
			
			this.name2 = name2;
		}
		public void setNum1() {
			// 외부에서 받는 숫자가 없으므로 파라미터가 필요 없다
			this.num1 = (int) ((Math.random()*13)+1);
			// 1부터 13까지의 정수 중에서 랜덤 숫자를 리턴
		}
		public void setNum2() {
			this.num2 = (int) ((Math.random()*13)+1);
		}
	
		public int getNum1(int num1, int num2) {
			this.num1 = num1;
			this.num2 = num2;
			if(num1<num2)
				return num2;
			else if (num1>num2)
				return num1;
			else
				return 1;
		}
		public String getWinner() {
			String winner ="";
			if(this.getNum1(num1, num2)==num1)
				winner = this.name1 + "승리";
			else if(this.getNum1(num1, num2)==num2)	
				winner = this.name2 + "승리";
			else 
				winner = "비김";
			     return winner;
		}
	@Override
	public String toString() {

		String str="";
		str = "["+name1+" : "+num1+"] vs ["+name2+" : "+num2+"] \n"
			 	+this.getWinner();
		return str;
	}
	}

