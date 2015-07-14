package encapsulation;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		String name = "",msg="";
		double height=0.0d, weight = 0.0d;
		int idx =0; // 카우프 인덱스
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("몸무게를 입력하세요");
		weight = scanner.nextDouble();
		System.out.println("키를 입력하세요");
		height = scanner.nextDouble();
		
		KaupBean4 kaupBean4= new KaupBean4();
		kaupBean4.setName(name);
		kaupBean4.setHeight(height);
		kaupBean4.setWeight(weight);
		kaupBean4.getIndex();
		System.out.println(kaupBean4.toString());
	}
}
