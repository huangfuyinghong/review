package edu.java.variable;

import java.util.Scanner;

public class VariableMain09 {

	public static void main(String[] args) {
		
		System.out.println("���� ��� ���α׷�");
		// Ű����� ��/��/�� ������ ������ �Է¹޾Ƽ� ������ ����� ����ϴ� ���α׷� �ۼ� 
		
		// 1. �Է¹��� �ܺ� : Scanner �ۼ� 
		Scanner sc = new Scanner(System.in);
		
		// 2. ����, ����, ���� ������ int�� �Է¹޾Ƽ� ����  
		System.out.println("���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.println("���� ���� �Է� : ");
		int eng = sc.nextInt();
		System.out.println("���� ���� �Է� : ");
		int math = sc.nextInt();
		
		// 3. ����, ����, ���� ������ ���  
		System.out.println("���� ���� : " + kor);
		System.out.println("���� ���� : " + eng);
		System.out.println("���� ���� : " + math);
		
		// 4. ������ ����ؼ� ���  
		int sum = kor + eng + math; 
		System.out.println("���� = " + sum);
		
		// 5. ����� ����ؼ� ��� (�Ҽ��� ��°�ڸ� ����) 
		// ����) ����/�Ǽ� -> �Ǽ� ���� ������  
		// ����) 1/3.0 = 0.33333333....
		System.out.printf("��� : %.3f", sum/3);
		
		// 6. Scanner ����(close) 
		sc.close();
		

	}

} // end VariableMain09
