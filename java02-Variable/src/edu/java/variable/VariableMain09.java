package edu.java.variable;

import java.util.Scanner;

public class VariableMain09 {

	public static void main(String[] args) {
		
		System.out.println("총점 계산 프로그램");
		// 키보드로 국/영/수 점수를 정수로 입력받아서 총점과 평균을 출력하는 프로그램 작성 
		
		// 1. 입력받을 줌비 : Scanner 작성 
		Scanner sc = new Scanner(System.in);
		
		// 2. 국어, 영어, 수학 점수를 int로 입력받아서 저장  
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		// 3. 국어, 영어, 수학 점수를 출력  
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 저수 : " + math);
		
		// 4. 총점을 계산해서 출력  
		int sum = kor + eng + math; 
		System.out.println("총점 = " + sum);
		
		// 5. 평균을 계산해서 출력 (소수점 세째자리 까지) 
		// 참고) 정수/실수 -> 실수 값을 돌려줌  
		// 예시) 1/3.0 = 0.33333333....
		System.out.printf("평균 : %.3f", sum/3);
		
		// 6. Scanner 종료(close) 
		sc.close();
		

	}

} // end VariableMain09
