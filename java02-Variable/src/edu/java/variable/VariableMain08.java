package edu.java.variable;

import java.util.Scanner;

public class VariableMain08 {

	public static void main(String[] args) { 
		
		System.out.println("���� �����");
		
		// ����� �ޱ� ���� ���� Scanner ���� 
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է� : ");
		int kor = sc.nextInt(); // ������ �Է� ���� 
		System.out.println("���� ���� : " + kor);
		
		System.out.println();
		
		System.out.println("�Ǽ� �Է� : ");
		double x = sc.nextDouble(); // �Ǽ��� �Է¹���  
		System.out.println("x = " + x);
		
	}
	
} // end VariableMain08
