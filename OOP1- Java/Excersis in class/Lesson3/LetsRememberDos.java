import java.util.Scanner;

public class LetsRememberDos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int option;
		
		do{
			System.out.println("**********************************");
			System.out.println("*1. Calculator                   *");
			System.out.println("*2. Hello                        *");
			System.out.println("*0. Exit                         *");
			System.out.println("**********************************");
			
			option = in.nextInt();
			switch(option){
			case 1:
				System.out.println("���� �������� 2 �����");
				double a = in.nextDouble();
				double b = in.nextDouble();
				System.out.println("���� �������� ��������");
				char op = in.next().charAt(0);
				
				switch(op){
				case '+':
					System.out.println(a+b);
					break;
				case '/':
					if( b != 0){
						System.out.println(a / b);
					}else{
						System.out.println("�� ���� �� �� ���� �� 0");
					}
					break;
				}
				break;
			case 2:
				System.out.println("��� �� �������?");
				String name = in.nextLine();
				System.out.println("������� " + name);
				break;
			}
			
		}while(option != 0);
		System.out.println("� �� �� �� ������!!!");
	}

}
