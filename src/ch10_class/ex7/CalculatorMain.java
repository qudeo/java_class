package ch10_class.ex7;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        /**
         * 실행하면 반복문으로 메뉴를 출력
         * 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈
         * 각 번호를 선택하면 Calculator 클래스에 있는 해당 메서드를 호출하여 결과를 출력함
         */

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈");
            int t = scanner.nextInt();
            if(t == 1) {
                System.out.println("첫번째 수");
                int num1 = scanner.nextInt();
                System.out.println("두번째 수");
                int num2 = scanner.nextInt();
                calculator.sum(num1, num2);

            }else if (t == 2) {
                System.out.println("첫번째 수");
                int num1 = scanner.nextInt();
                System.out.println("두번째 수");
                int num2 = scanner.nextInt();
                calculator.sub(num1, num2);

            }else if (t == 3) {
                System.out.println("첫번째 수");
                int num1 = scanner.nextInt();
                System.out.println("두번째 수");
                int num2 = scanner.nextInt();
                int result = calculator.mul(num1, num2);
                System.out.println("result = " + result);

            }else if (t == 4) {
                int result = calculator.div();
                System.out.println("result = " + result);

            }else {
                System.out.println("메뉴의 범위가 아닙니다.");
            }



        }



    }
}
