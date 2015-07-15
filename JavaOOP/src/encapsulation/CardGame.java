package encapsulation;

public class CardGame {
	private String winner;
	// 생성자 단축키
	// CTRL + SPACE
	public CardGame() { // 디폴트 생성자
		// TODO Auto-generated constructor stub
             // null인 이유는 데이터 타입이 클래스 이름이기 때문
	}

	public CardGame(CardBean3 bean1, CardBean3 bean2) {
		// TODO Auto-generated constructor stub
		String winner ="";
		if(bean1.getNum2()>bean2.getNum2())
			winner = bean1.getName1() + "승리";
		else if(bean1.getNum2()<bean2.getNum2())
			winner = bean2.getName1() + "승리";
		else 
			winner = "비김";
		  
	
	}
	public String getWinner() {
		return winner;
	}
}
