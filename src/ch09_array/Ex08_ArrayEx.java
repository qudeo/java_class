package ch09_array;

import java.util.Scanner;

public class Ex08_ArrayEx {
    public static void main(String[] args) {
        /**
         * 스캐너로 입력 받은 숫자의 크기를 갖는 배열을 만들어 봅시다.
         * 예를 들어 5를 입력하면
         * 크기가 5인 배열이 만들어져야 함
         */

        int[] numbers1 = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("만들 배열의 크기를 지정하시오.");
        int t = scanner.nextInt();
        if (t > 0) {
            numbers1 = new int[t];
        } else {
            numbers1 = null;
        }
        System.out.println(numbers1.length);
    }
}
