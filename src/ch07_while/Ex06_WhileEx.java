package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {
        /**
         * 정수를 입력했을때 입력한 숫자만큼 출력하고
         * 정수들의 평균값을 구하기
         *
         */


        int sum = 0;
        int num2 = 0;
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하고 마지막에 0을 입력하세요 : ");

        while (run) {
            int num1 = scanner.nextInt();
            num2 = num2 + num1;

            if (num1 != 0) {
                sum = sum + 1;
            }else {
                run = false;
                System.out.println("입력한 숫자는 " + sum + "개 입니다.");
                double num3 = num2 / sum;
                System.out.println("평균은 " + num3 + " 입니다.");
            }


        }
    }
}
