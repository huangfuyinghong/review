package edu.java.variable;

//char : ���� �ϳ��� �����ϴ� ������ Ÿ��, 2����Ʈ 
//������ �����ڵ� ��(0 �Ǵ� ���� ����)�� �����ϴ� Ÿ�� 
//0 ~ 65,535
//����(character)�� ���� ����ǥ(' ')�� ��� 
//���ڿ�(string)�� ū ����ǥ(" ")�� ���  
//����  ) 
//'��', '��', ' ' : ����(character) ���ͷ� 
//"�ѱ�", "�ѱ�", "��", " " : ���ڿ�(string) ���ͷ� 

public class VariableMain06 {

	public static void main(String[] args) {
		
		System.out.println("���� Ÿ��(char)");
		
		char ch1 = 'A';
		System.out.println("ch1 = " + ch1); // ���� ��ü ��� 
		System.out.println("ch1 = " + (int)ch1); // ������ �ڵ尪 ���  
		
		char ch2 = '��';
		System.out.println("ch2 = " + ch2); // ���� ��ü ��� 
		System.out.println("ch2 = " + (int)ch2); // ������ �ڵ尪 ���  
		
		char ch3 ='1';
		System.out.println("ch3 = " + ch3); // ���� ��ü ���  
		System.out.println("ch3 = " + (int)ch3); // ������ �ڵ尪 ���  
		
		char ch4 = 1;
		System.out.println("ch3 = " + ch4); // ���� ��ü ��� 
		System.out.println("ch3 = " + (int)ch4); // ������ �ڵ尪 ���  
		
		// ���ڳ��� �� ���� 
		boolean b = '��' < '��';
		System.out.println("b = " + b);

	}

} // end VariableMain06
