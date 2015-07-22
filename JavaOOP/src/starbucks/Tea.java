package starbucks;
/*
홍차(tea) 끊이는 순서
1. 물을 끊인다.
2. 티백을 내린다
3. 물을 컵에 붓는다.
4. 레몬,자몽 첨가 여부를 손님에게 묻는다
	. 레몬 : 레몬티, 자몽 : 자몽티
5. 홍차를 제공한다.
	- 고객님 레몬티가  나왔습니다.
* */
public class Tea extends Coffee{
	private String msg;
	@Override
	public void brew() {
		
		
		System.out.println("2. 티백을 내린다");
	}

	@Override
	public void select(int option) {
		
		
	
		switch (option) {
		case 3:
			 
			
			this.msg = "레몬티";
			break;

		case 4:
			
			this.msg = "자몽티";
			break;
		default:
			System.out.println("다시 입력하시오");
			break;
	
	}
	}
	@Override
	public void serve() {
		
	
		System.out.println("5. 홍차를 제공한다."+
			 	"- 고객님 "+msg+" 가  나왔습니다.");
	}
}