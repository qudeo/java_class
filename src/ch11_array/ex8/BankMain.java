package ch11_array.ex8;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankService bankService = new BankService();
        boolean run = true;
        int SelectNo = 0;

        while (run) {
            System.out.println("===========================================================================");
            System.out.println("1.계좌등록 | 2.잔액조회 | 3.입금 | 4.출금 | 5.입출금 내역 조회 | 6.계좌이체 | 0.종료");
            System.out.println("===========================================================================");
            System.out.print("원하시는 메뉴를 선택하세요 : ");
            SelectNo = scanner.nextInt();
            if (SelectNo == 1) {
                bankService.save();
            } else if (SelectNo == 2) {
                bankService.list();
            } else if (SelectNo == 3) {
                bankService.deposit();
            } else if (SelectNo == 4) {
                bankService.withdraw();
            } else if (SelectNo == 5) {
                bankService.dwList();
            } else if (SelectNo == 6) {

            } else if (SelectNo == 0) {
                run = false;
            } else {
                System.out.println("메뉴를 벗어난 값입니다.");
            }
        }

    }
}
