package uni.fmi.bachelors;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("��� ��� ���?");
		
		String day = keyboard.next();
		
		switch(day){
		case "pon":
		case "vto":
		case "srq":
		case "chet":
			System.out.println("������� ���!");
			break;
		case "pet":
			System.out.println("������� ��� �� �����!");
			break;
		case "sab": case "ned":
			System.out.println("������� ���!");
			default:
				System.out.println("����������� ���!");
		}
	}

}
