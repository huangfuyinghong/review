package edu.java.variable;

import java.util.Scanner;

public class VariableMain08 {

	public static void main(String[] args) { 
		
		System.out.println("변수 입출력");
		
		// 입출력 받기 위한 변수 Scanner 선언 
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt(); // 정수를 입력 받음 
		System.out.println("국어 점수 : " + kor);
		
		System.out.println();
		
		System.out.println("실수 입력 : ");
		double x = sc.nextDouble(); // 실수를 입력받음  
		System.out.println("x = " + x);
		
	}
	
} // end VariableMain08
