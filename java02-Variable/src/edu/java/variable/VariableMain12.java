package edu.java.variable;

import java.util.Scanner;

public class VariableMain12 {

	public static void main(String[] args) {
		
		System.out.println("���ڿ� �Է� �ޱ�");

		String str1 = "+";
		System.out.println(str1);
		
		String str2 = "�ȳ��ϼ���?";
		System.out.println(str2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� �Է� : ");
		String str3 = sc.nextLine();
		System.out.println(str3);
		
		// nextInt() : ���� �Է� �Լ�  
		// nextDoutle() : �Ǽ� �Է� �Լ�  
		// nextLine() : ���ڿ� �� ���� �Է¹޴� �Լ�  
		// sc.nextLine().charAt(0) : ���� �Ѱ� �Է� �޴� �ڵ�  
		
		// ���� �Ѱ� �Է¹޴� �ڵ�  
		char c = sc.nextLine().charAt(0);
		System.out.println("���� �Ѱ� ��� : " + c);
	}

} // end VariableMain13
