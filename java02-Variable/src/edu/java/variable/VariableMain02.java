package edu.java.variable;

//자바의 기본 자료형  
//논리형 : boolean(1바이트) 
//정수형 : byte(1바이트), short(2바이트), int(4바이트), long(8바이트), char(2바이트)
//실수형 : float(4바이트), double(8바이트) 

public class VariableMain02 {

	public static void main(String[] args) { 
		
		System.out.println("자바의 기본 자료형");
		byte n1 = 5; 
		System.out.println("n1 = " + n1);
		
		// 주석 (comment) : 커파일러가 읽지 못하는 코드 
		// 주석은 코드에 대한 설명이나 특정 위치를 실행하지 않기 위해 활용  
		
		// ctrl + / : 코드 주석 처리 및 주석 해제  
		// n1 = 128; 
		
		short n2 = 1234; 
		System.out.println("n2 = " + n2);
		// n2 = 33333; // 에러 발생, short 공간 보다 큰 수 
		
	}
	
} // end VariableMain02 
