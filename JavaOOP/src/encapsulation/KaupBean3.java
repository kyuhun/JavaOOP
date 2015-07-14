package encapsulation;

import java.util.Scanner;



/*
 * @ Date : 2015.07.14
 * @ Author : me
 * @ Story : 카우푸지수 프로그램을 객체화 하는 예제
 * 
 * */
public class KaupBean3 {
	
	 
	/*
	 멤버필드는 은닉화된 데이터 값이 모여 있는 공간이다. 
	 가장 큰 특징은 초기화를 하지 않는다. 이유는 멤버메소드들이 
	 이 데이터 공간(필드)를 ★★★  공유하기 때문이다.
	 * */
	
	private String name, msg;
	private double height, weight;
	private int idx;
	public  void getIndex() { // 메소드(동사) 
		
		/*
		 [오더]
		 카우푸지수는 키와 몸무게를 입력하면 
		 저체중.. 정상..비만. 이런식의 결과값을 
		 알려주는 프로그램
		 콘솔에 출력되는 문장은 "[홍길동] 키는 180cm, 몸무게 : 70kg, 카우푸지수 : 정상"
		 이고 카우프 공식: (몸무게 /(키*키))*10000 결과값이 
		 30 초과 : 비만
		 24 초과 : 과체중
		 20 초과 : 정상
		 15 초과 : 저체중
		 13 초과 : 마름
		 10 초과 : 영양실조
		 * */
		// 선언부 
		
		idx = (int) ((weight /(height*height))*10000);
		// 연산부
			if (idx>30) {
			msg = "비만";
		} 	else if(idx>24){
				msg = "과체중";
			}
		
			else if(idx>20){
				msg = "정상";
			}
			else if(idx>15){
				msg = "저체중";
			}
			else if(idx>13){
				msg = "마름";
			}
			else{
				msg = "영양실조";
			}
				// 출력부
		
		
		/*public String toString()
		{
			
			  public : 접근 제한자
			  String : 리터 타입(결과값의 타입이 String이다)
			  toString : 메소드 이름 ( 이것은 자바에서 픽스된 메소드)
			 * 
			// 선언부
			 String str = ""; // 지역변수는 무조건 초기화
			
			 // 연산부
			str = "["+name+"] 키는" +height+"cm, 몸무게 : "+weight+"kg, 카우푸지수 :" +msg;
			 
			 // 출력부
			return str; 
		}*/
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub

		/*
		  public : 접근 제한자
		  String : 리터 타입(결과값의 타입이 String이다)
		  toString : 메소드 이름 ( 이것은 자바에서 픽스된 메소드)
		 * */
		// 선언부
		 String str = ""; // 지역변수는 무조건 초기화
		
		 // 연산부
		str = "["+name+"] 키는" +height+"cm, 몸무게 : "+weight+"kg, 카우푸지수 :" +msg;
		 
		 // 출력부
		return str; 
		
	}
}
