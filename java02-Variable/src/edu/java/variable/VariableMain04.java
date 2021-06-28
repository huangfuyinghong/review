package edu.java.variable;

// 자바에서 실수 리터럴은 double로 취급하기 때문에 , 
// float 타입으로 명시하기 위해서는 대문자 F 또는 소문자 f를 숫자 뒤에 붙여줌
// double 타입은 float 타입보다 더 크고, 더 정밀한(소수점 이하지리수가 더 큼)수를 표현할 수 있음  
// 자바에서 실수 타입 리터럴(상수)의 기본 타입은 double 
// 1.23 <- 자바는 double 취급 

public class VariableMain04 {

	public static void main(String[] args) { 
		
		System.out.println("실수 자료형(Floating type)");
		double x = 3.14;
		System.out.println("x = " + x);
		
		float y = 3.14f; 
		System.out.println("y = " + y);
		// 자바에서 실수 리터럴은 double로 취급하기 때문에 , 
		// float 타입으로 명시하기 위해서는 대문자 F 또는 소문자 f를 숫자 뒤에 붙여줌
		
		// int a - 3.14f; // float -> int : 에러 발생  
		double n1 = 123; // int -> double 자동형 변환  
		double n2 = 100; 
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("나눗셈 : " + (n1 / n2));
		// 실수 표현 : 소숫점 6자리 까지 출력 
		// printf를 사용 
		System.out.printf("나눗셈 : %.6f", (n1/n2));  
		// %.6f : 소숫점 n째 자리까지 출력 
		
	}
	
} // end VariableMain04
