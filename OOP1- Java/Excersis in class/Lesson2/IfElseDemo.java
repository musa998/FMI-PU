package uni.fmi.bachelors;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		
		System.out.println("���� �������� ��������");
		
		double from  = in.nextDouble();
		double to = in.nextDouble();
		
		System.out.println("���� ������ �����");
		
		double number = in.nextDouble();
		
		if(number >= from && number <= to){
			System.out.println("�������� �����");
		}else{
			System.out.println("����� ���������");
		}
		
		
		
	}

}
