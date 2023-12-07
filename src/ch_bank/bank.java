package ch_bank;

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        /**
         * 1. 예금 2. 출금 3. 잔고. 4. 종료
         *
         */

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int sum = 0;

        while (run) {
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택 > ");
            int t = scanner.nextInt();
            switch (t){
                case 1:
                    System.out.print("예금액 > ");
                    int num1 = scanner.nextInt();
                    sum = sum + num1;
                    System.out.println("현재잔액은 " + sum + "원입니다.");
                    break;
                case 2:
                    System.out.print("출금액 > ");
                    int num2 = scanner.nextInt();
                    if (num2 > sum){
                        System.out.println("잔고가 부족합니다.");
                    }else {
                        sum = sum - num2;
                        System.out.println("현재잔액은 " + sum + "원입니다.");
                        break;
                    }
                case 3:
                    System.out.println("현재잔액은 " + sum + "원입니다.");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    run = false;
                    break;
                default:
                    System.out.println("메뉴는 1부터 4까지밖에 없습니다.");
                    break;
            }

        }
    }
}
