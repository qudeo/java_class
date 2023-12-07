package ch09_array;

import java.util.Scanner;

public class Ex04_ArrayEx {
    public static void main(String[] args) {
        int num[] = { 5, 2, 1, 3, 4, 7, 6, 9, 10, 8 };
        /**
         * 위와 같은 배열이 있을 때 1~10 사이의 숫자 중에서 하나를
         * 입력했을 때 그 숫자가 몇 번 인덱스에 있는지 출력
         */

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        for (int i = 0; i < num.length; i++){
            if (num1 == num[i]){
                System.out.println(i);
            }
        }
    }
}
