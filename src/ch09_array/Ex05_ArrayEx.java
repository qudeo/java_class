package ch09_array;

import java.util.Scanner;

public class Ex05_ArrayEx {
    public static void main(String[] args) {
        /**
         * 거스름돈 계산하기
         * 필요한 거스름돈을 입력했을 때 각 동전별로 몇 개가 필요한지 계산
         * 예)
         * 170 이라고 입력하면
         * 100원 1개
         * 50원 1개
         * 10원 2개
         *
         * 780 이라고 입력하면
         * 500원 1개
         * 100원 2개
         * 50원 1개
         * 10원 3개
         *
         */
        int m = 0;
        int n = 0;
        int[] coin = {500, 100, 50, 10};
        int[] cnt = new int[4];
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int i = 0;
        for (i = 0; i < coin.length; i++) {
            cnt[i] = num1 / coin[i]; // 필요한 동전 갯수
            num1 = num1 % coin[i]; // 다음 인덱스의 동전으로 나눌 수 있다.
            System.out.println(cnt[i] + "개");
        }
    }

}
