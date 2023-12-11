package ch09_array;

import java.util.Scanner;

public class Ex06_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 저장한 뒤
         * 입력된 값 중에서 가장 큰 값을 출력
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("배열 값 저장");

        int[] numbers1 = new int[5];


        int max = numbers1[0];

        for (int i = 0; i < numbers1.length; i++){
            int num1 = scanner.nextInt();
         if (max < num1) {
             numbers1[i] = num1;
             max = num1;
         }
        } System.out.println(max);
    }
}
