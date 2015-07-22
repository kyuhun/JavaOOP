package starbucks;

public class Coffee	implements Recipe {
	private String msg;
	@Override
	public void boilWater() {
	System.out.println("1. 물을 끊인다.");
		
	}

	@Override
	public void brew() {
		System.out.println("2. 커피를 내린다");
		
	}

	@Override
	public void pourInCup() {
		System.out.println("3. 물을 컵에 붓는다.");
	}

	@Override
	public void select(int option) {
		switch (option) {
		case 1:
			 
			
			this.msg = "블랙";
			break;

		case 2:
			
			this.msg = "밀크";
			break;
		default:
			System.out.println("다시 입력하시오");
			break;
		}
		
	}

	@Override
	public void serve() {
	System.out.println("5. 커피를 제공한다."+
	 	"- 고객님 "+msg+" 커피가  나왔습니다.");
	}

}
