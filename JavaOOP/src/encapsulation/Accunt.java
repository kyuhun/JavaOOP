package encapsulation;

import java.util.Scanner;

/*
  은행계좌
  1. 은행이름 => 아이티뱅크 bank
 2. 통장번호 => 5자리의 랜덤숫자 bankbookNo
 3. 주인이름 => 소유자 이름(생성자에 스캐널 입력받는 값) name
 4. 날짜/예금/출금/잔액 => 스캐너로 입력 받는 값 숫자타입 int => money
 5. 비밀번호 => 스캐너로 입력 받는 값, 숫자 타입 =>pass
 
 
 * */
public class Accunt {
	
	private String bank, name;
	private int money, pass;
	private int [] bankbookNo = new int[5];
	public String getBank() {
		return this.bank= "아이티 뱅크";

	}

	}

