package encapsulation;
/*
  버전업
  현재는 홍길동 승이라고 하는데. 
  개선을 해달라랍니다. 
  홍길동 : 6 
  김유신 : 4
 * */
public class CardGame {
	private String winner, looser;
	private int winScore,looseScore;
	// 생성자 단축키
	// CTRL + SPACE
	public CardGame() { // 디폴트 생성자
		// TODO Auto-generated constructor stub
             // null인 이유는 데이터 타입이 클래스 이름이기 때문
	}

	public CardGame(CardBean3 bean1, CardBean3 bean2) {
		// TODO Auto-generated constructor stub
		String winner ="", looser = "";
		int winScore = 0, looseScore = 0; 
		// 지역변수(로컬변수) 는 메모리 영역중에서 (콜) 스택에 저장
		// 인스턴스변수는 메모리영역에  힙에 저장
		if(bean1.getNum2()>bean2.getNum2())
			{
			winner = bean1.getName1();
			looser = bean2.getName1();
			winScore = bean1.getNum2();
			looseScore = bean2.getNum2();
			}
		else if(bean1.getNum2()<bean2.getNum2()){
			winner = bean2.getName1();
			looser = bean1.getName1();
			winScore = bean2.getNum2();
			looseScore = bean1.getNum2();
		}
		else 
			{winner = "비김";
			}
		  
		  this.winner = winner;
		  this.looser = looser;
		  this.winScore = winScore;
		  this.looseScore = looseScore;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str ="";
		if(!(this.winner.equals("비김")))
		{ str = this.winner+" :" +this.winScore + "\n"
						+this.looser+" :" +this.looseScore+ "\n"
						+ this.winner + "승리"	;
		}
		else 
		 str = "비김";
		return str;
		}
}
