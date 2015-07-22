package starbucks;

public class AngelCoffee extends DrinkRecipe{
	private String msg;
	@Override
	void brew() {
		System.out.println("커피를 내린다.");
		
	}

	@Override
	void select(int option) {
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
	void serve() {
		System.out.println("5. 커피를 제공한다."+
			 	"- 고객님 "+msg+" 커피가  나왔습니다.");
		
	}

}
