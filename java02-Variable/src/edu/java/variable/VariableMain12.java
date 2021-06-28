package edu.java.variable;

import java.util.Scanner;

public class VariableMain12 {

	public static void main(String[] args) {
		
		System.out.println("문자열 입력 받기");

		String str1 = "+";
		System.out.println(str1);
		
		String str2 = "안녕하세요?";
		System.out.println(str2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str3 = sc.nextLine();
		System.out.println(str3);
		
		// nextInt() : 정수 입력 함수  
		// nextDoutle() : 실수 입력 함수  
		// nextLine() : 문자열 한 줄을 입력받는 함수  
		// sc.nextLine().charAt(0) : 문자 한개 입력 받는 코드  
		
		// 문자 한개 입력받는 코드  
		char c = sc.nextLine().charAt(0);
		System.out.println("문자 한개 출력 : " + c);
	}

} // end VariableMain13
