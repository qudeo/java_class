package ch06_for;

import java.util.Scanner;

public class Ex05_ForEx {
    public static void main(String[] args) {
        /**
         * 두 개의 정수를 입력받아서 시작값부터 끝값까지의 합계 출력
         * 입력 예
         * 시작값 : 110
         * 끝값 : 555
         * 출력 예
         * 110 부터 555 까지의 합은 000 입니다.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("시작값을 설정하세요 : ");
        int num1 = scanner.nextInt();
        System.out.println("끝값을 설정하세요 : ");
        int num2 = scanner.nextInt();
        int sum = 0;
        for(int i = num1; i <= num2; i++){
            sum = i + sum;
        }
        System.out.println(num1 + "부터 " + num2 + " 까지의 합은 " + sum + "입니다.");


    }
}
