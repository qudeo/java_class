package ch0_variables;

public class Ex01_ArithmeticOperator {

	public static void main(String[] args) {
		// 산술연산자
		/**
		 * num1, num2 두개의 정수형 변수를 선언하고 값은 마음대로
		 * 두 변수의 +,-, *, /, % 연산결과를 print() 를 활용하여 출력해봅시다.
		 * 출력방법
		 * System.out.println(num1 + num2)
		 */
		int num1 = 10;
		int num2 = 5;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		int result = 0;
		result = num1 + num2 ;
		System.out.println(result);
		result = num1 - num2 ;
		System.out.println(result);
		result = num1 * num2 ;
		System.out.println(result);
		result = num1 / num2 ;
		System.out.println(result);
		result = num1 % num2 ;
		System.out.println(result);
		
		// 계산 결과 변수를 따로 선언
		int sumResult = num1 + num2;
		System.out.println(sumResult);
		int subResult = num1 - num2;
		System.out.println(sumResult);
		int mulResult = num1 * num2;
		System.out.println(sumResult);
		int divResult = num1 / num2;
		System.out.println(sumResult);
		int remainResult = num1 % num2;
		System.out.println(sumResult);
		
//		boolean result = 77 <= 60;
//		System.out.println(result);
//		result = (8 == 100);
//		System.out.println(result);
//		result = false;
//		boolean bool1 = true;
//		// 변수값을 다른 변수에 대입하는 것은 복사 개념
//		result = bool1;
//		System.out.println(result);
//		System.out.println(bool1);
	}

}
