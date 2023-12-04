package ch03_Scanner;

import java.util.Scanner;

public class Ex02_Calculator {

	public static void main(String[] args) {
		/**
		 *  정수 2개를 각각 스캐너로 num1, num2에 입력받아서 입력받은 수의 합을 출력하세요.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(num1 + num2);
		
		System.out.println("이름을 입력하세요: ");
		String name = scanner.next();
		System.out.println(name);
		
		scanner.nextLine();
		
		System.out.println("주소를 입력하세요: ");
		String address = scanner.nextLine();
		System.out.println(address);
	}

}
