package inhebitance;

import java.util.Scanner;

public class AndroidPhoneMain {
	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone();
		Scanner scanner = new Scanner(System.in);
		System.out.println("통화 상대 : ");
		String name = scanner.next();
		System.out.println("메시지 : ");
		String msg = scanner.next();
		androidPhone.setOs(""); // 사용자가 아무 액션도 하지 않고
		// 스캐너를 입력만 하면 OS는 android 가 setting 되게 만듬
		androidPhone.setDate(name, msg);
		System.out.println(androidPhone.getData());
	}
}
