package encapsulation;

public class Blue {
	private int sum;
	/* ====== Filed =======*/
	// 주사위 두개 값의 합

	
	/*======= Constructor =======*/
	// 생성자 파라미터 2개(주사위) 
	
	public  Blue() {
		
	}
	
	
	public Blue(Dice dise2, Dice dise3) {
		// TODO Auto-generated constructor stub
	
		this.sum = dise2.getDice1() + dise3.getDice1();
	
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "두 주사위의 합이 "+sum+"이니 "+sum+"칸 전진";
	}
}
