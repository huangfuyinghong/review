package edu.java.variable;

//�ڹ��� �⺻ �ڷ���  
//���� : boolean(1����Ʈ) 
//������ : byte(1����Ʈ), short(2����Ʈ), int(4����Ʈ), long(8����Ʈ), char(2����Ʈ)
//�Ǽ��� : float(4����Ʈ), double(8����Ʈ) 

public class VariableMain02 {

	public static void main(String[] args) { 
		
		System.out.println("�ڹ��� �⺻ �ڷ���");
		byte n1 = 5; 
		System.out.println("n1 = " + n1);
		
		// �ּ� (comment) : Ŀ���Ϸ��� ���� ���ϴ� �ڵ� 
		// �ּ��� �ڵ忡 ���� �����̳� Ư�� ��ġ�� �������� �ʱ� ���� Ȱ��  
		
		// ctrl + / : �ڵ� �ּ� ó�� �� �ּ� ����  
		// n1 = 128; 
		
		short n2 = 1234; 
		System.out.println("n2 = " + n2);
		// n2 = 33333; // ���� �߻�, short ���� ���� ū �� 
		
	}
	
} // end VariableMain02 
