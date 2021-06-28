package edu.java.variable;

// 변수(variable) : 값을 저장할 수 있는 메모리 공간, 
// 변수에는 하나의 값만 저장 가능  
// 선언형태 
// 타입 변수이름; 

public class VariableMain01 {

	public static void main(String[] args) {
		
		System.out.println("변수(Variable)");
		// System.out.println() : 소괄호 안에 내용을 출력  
		// 세미콜론(;) : 코드 한줄의 끝을 의미  
		// ctrl + F11 : 프로그램 실행 단축키 
		
		System.out.println("줄바꿈 있음");
		System.out.print("줄바꿈 없음");
		// Ctrl + Space bar : 자동완성 단축키  
		
		// 타입 변수이름; 
		int x = 10; // 정수형 변수 x에 10을 저장해라  
		System.out.println("x = " + x);
		
		int y; // 정수형 변수 y선언  
		y = 20; // 변수 초기화 (값을 저장) 
		System.out.println("y = " + y);
		
		x = 12; // 이미 선언된 변수의 값을 변경  
		x = 12 + y; // 다른 변수를 연산할 수 있음 
		y = 10; 
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}
	
} // end VariableMain01 
