package edu.java.variable;

import java.util.Scanner;

public class VariableMain10 {

	public static void main(String[] args) { 
		
		// ���� �ڵ� 
		System.out.println("������ ����");
		// �Ǽ� 2���� �Է¹޾Ƽ� ���� 
		// �� ���� ��Ģ����( +, -, *, /)�� ����� ���  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է� : ");
		double x = sc.nextDouble();
		System.out.println("x = " + x);
		
		System.out.println("�ι�° ���� �Է� : ");
		double y = sc.nextDouble();
		System.out.println("y = " + y);
		
		double result; // ����� ����
		result = x + y; // ���� 
		System.out.println(x + "+" + y + "=" + result);
		
		result = x - y; // ����  
		System.out.println(x + "-" + y + "=" + result);
		
		result = x * y; // ����  
		System.out.println(x + "*" + y + "=" + result);
		
		result = x / y; // ������  
		System.out.println(x + "/" + y + "=" + result);
		
		sc.close();
	
	}
	
} // end VariableMain10 
