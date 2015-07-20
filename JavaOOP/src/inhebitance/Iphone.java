package inhebitance;

public class Iphone extends CellPhone{
	/*======= 필드 ========*/
	private String date;
	private String os; // 운영체제
	public static boolean TRUE = true; //오로지 이동전화만 만드는 회사
	public static String BRAND = "아이폰"; 
	// 브랜드를 static이라는 키워드를 사용해서 클래스변수를 만들고
	// 고정값으로 할당

	
	
	/*===== 생성자 ====== */
	/*====== 멤버메소드 ===== */
	public String getDate() {
		return date;
	}
	// get/set / 이 되었건 파라미터 추가하는 정도의 변화는
	// 개발자 재량에 있다.
	public void setDate(String name,String date) {
		this.date = name+"에게, 메세지로"+date+ "를 전달";
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = "iOS";
	}
	
}
