package edu.java.variable;

// ����(variable) : ���� ������ �� �ִ� �޸� ����, 
// �������� �ϳ��� ���� ���� ����  
// �������� 
// Ÿ�� �����̸�; 

public class VariableMain01 {

	public static void main(String[] args) {
		
		System.out.println("����(Variable)");
		// System.out.println() : �Ұ�ȣ �ȿ� ������ ���  
		// �����ݷ�(;) : �ڵ� ������ ���� �ǹ�  
		// ctrl + F11 : ���α׷� ���� ����Ű 
		
		System.out.println("�ٹٲ� ����");
		System.out.print("�ٹٲ� ����");
		// Ctrl + Space bar : �ڵ��ϼ� ����Ű  
		
		// Ÿ�� �����̸�; 
		int x = 10; // ������ ���� x�� 10�� �����ض�  
		System.out.println("x = " + x);
		
		int y; // ������ ���� y����  
		y = 20; // ���� �ʱ�ȭ (���� ����) 
		System.out.println("y = " + y);
		
		x = 12; // �̹� ����� ������ ���� ����  
		x = 12 + y; // �ٸ� ������ ������ �� ���� 
		y = 10; 
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}
	
} // end VariableMain01 
