package edu.java.variable;

import java.util.Scanner;

public class VariableMain10 {

	public static void main(String[] args) { 
		
		// 계산기 코드 
		System.out.println("간단한 계산기");
		// 실수 2개를 입력받아서 저장 
		// 두 수의 사칙연산( +, -, *, /)의 결과를 출력  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력 : ");
		double x = sc.nextDouble();
		System.out.println("x = " + x);
		
		System.out.println("두번째 숫자 입력 : ");
		double y = sc.nextDouble();
		System.out.println("y = " + y);
		
		double result; // 결과값 변수
		result = x + y; // 덧셈 
		System.out.println(x + "+" + y + "=" + result);
		
		result = x - y; // 뺄셈  
		System.out.println(x + "-" + y + "=" + result);
		
		result = x * y; // 곱셈  
		System.out.println(x + "*" + y + "=" + result);
		
		result = x / y; // 나눗셈  
		System.out.println(x + "/" + y + "=" + result);
		
		sc.close();
	
	}
	
} // end VariableMain10 
