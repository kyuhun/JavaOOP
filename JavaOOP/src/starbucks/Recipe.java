package starbucks;
/*
 * @ Date : 2015.07.22
 * @ Author : me
 * @ Story : 추상클래스 학습
 * 
 * */
public interface Recipe {
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
	public abstract void boilWater();
	// 인터페이스는 무조건 추가메소드가 와야 
	// 하기 때문에 abstract이 생략되어도
	// 디폴트로 있는 것으로 간주하고 
	// 에러를 발생하지 않는다
	public void brew();
	public void pourInCup();
	public void select(int option);
	public void serve();
	
	
}
