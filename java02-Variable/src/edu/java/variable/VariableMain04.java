package edu.java.variable;

// �ڹٿ��� �Ǽ� ���ͷ��� double�� ����ϱ� ������ , 
// float Ÿ������ ����ϱ� ���ؼ��� �빮�� F �Ǵ� �ҹ��� f�� ���� �ڿ� �ٿ���
// double Ÿ���� float Ÿ�Ժ��� �� ũ��, �� ������(�Ҽ��� ������������ �� ŭ)���� ǥ���� �� ����  
// �ڹٿ��� �Ǽ� Ÿ�� ���ͷ�(���)�� �⺻ Ÿ���� double 
// 1.23 <- �ڹٴ� double ��� 

public class VariableMain04 {

	public static void main(String[] args) { 
		
		System.out.println("�Ǽ� �ڷ���(Floating type)");
		double x = 3.14;
		System.out.println("x = " + x);
		
		float y = 3.14f; 
		System.out.println("y = " + y);
		// �ڹٿ��� �Ǽ� ���ͷ��� double�� ����ϱ� ������ , 
		// float Ÿ������ ����ϱ� ���ؼ��� �빮�� F �Ǵ� �ҹ��� f�� ���� �ڿ� �ٿ���
		
		// int a - 3.14f; // float -> int : ���� �߻�  
		double n1 = 123; // int -> double �ڵ��� ��ȯ  
		double n2 = 100; 
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("������ : " + (n1 / n2));
		// �Ǽ� ǥ�� : �Ҽ��� 6�ڸ� ���� ��� 
		// printf�� ��� 
		System.out.printf("������ : %.6f", (n1/n2));  
		// %.6f : �Ҽ��� n° �ڸ����� ��� 
		
	}
	
} // end VariableMain04
