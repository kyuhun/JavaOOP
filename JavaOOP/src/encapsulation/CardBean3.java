package encapsulation;
/*
 * @ Date : 2015.07.15
 * @ Author : me
 * @ Story : 생성자 문법
 * 생성자는 setter를 통해 값을 할당하는 기능을 보강하여
 * 객체가 만들어짐과 동시에 값을 할당하도록 특수하게 만들어진 ★메소드 
 * */


public class CardBean3 {
	/*=====field =====*/
	private int num1,num2;
	private String name1,name2;
	
	/*==== Constructor =======*/
	// 생성자 위치는 (멤버) 필드와 메소드 영역 사이에 위치
	// 생성자 모양
	// public 클래스이름(){}
	
	public CardBean3() // 디폴트 생성자
	{				
		            // 디폴트 생성자는 개발자가 직접 만들지 않아도 
					// 프로그램 내부에서는 생성되 있는 것으로 인식한다.
					// 그런데, 이것을 꺼내든 이유는 new 키워드를 통한
					// 객체 생성 역할 뿐만 아니라 생성과 동시에 값을 할당하는
					// 기능을 추가 시키기 위해서
	}
	
	public CardBean3(String name) {
		// TODO Auto-generated constructor stub
		// setter 역할을 겸용하는 생성자
		this.name1=name;
		this.num1 =(int) ((Math.random()*13)+1);
	
	}


		
		
		
		public String getName1() {
			return name1;
		}
		public int getNum2() {
			return num2= (int) ((Math.random()*13)+1);
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

