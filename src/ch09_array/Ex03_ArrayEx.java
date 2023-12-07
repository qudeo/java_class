package ch09_array;

import java.util.Scanner;

public class Ex03_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 3인 정수형 배열을 선언하고
         * 실행 했을 때 스캐너로 정수값을 입력받아 배열에 저장
         * 배열에 저장된 값의 총합, 평균 계산
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 값 입력");
        int[] numbers1 = new int[3];
        int sum = 0;
        int sum2 = 0;
        for (int j = 0; j < numbers1.length; j++){
            numbers1[j] = scanner.nextInt();
            sum = sum + numbers1[j];
            sum2 = sum / numbers1.length;
        }
        System.out.println(sum);
        System.out.println(sum2);
    }
}
