package ch07_while;

import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {
        /**
         * random() 메서드를 이용해서 1~100 사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력해줌
         */



        int i = ((int)(Math.random() * 100) + 1);

        int sum = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1부터 100까지의 숫자를 입력하세요");
            int num1 = scanner.nextInt();

            sum = sum+1;

            if (num1 < i) {
                System.out.println("더 큰 수를 입력하세요.");
            }
            else if (num1 > i){
                System.out.println("더 작은 수를 입력하세요.");
            }else {
                System.out.println("정답입니다.");
                System.out.println("시도 횟수는 " + sum + "입니다.");
                break;
            }



        }



    }
}
