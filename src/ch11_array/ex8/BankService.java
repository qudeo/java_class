package ch11_array.ex8;

import java.util.Scanner;

public class BankService {
    Scanner scanner = new Scanner(System.in);
    BankRepository bankRepository = new BankRepository();

    public void save() {
        long balance = 0;
        boolean checkResult = false;
        String Number = null;
        System.out.print("성함 : ");
        String Name = scanner.next();
        do {
            System.out.print("계좌번호 : ");
            Number = scanner.next();
            checkResult = bankRepository.NumberCheck(Number);
            if (!checkResult) {
                System.out.println("사용 가능한 계좌번호 입니다.");
            } else {
                System.out.println("이미 사용 중인 계좌번호 입니다. 다른 계좌번호를 입력해주세요.");
            }
        } while (checkResult);

        System.out.print("비밀번호 : ");
        String Pass = scanner.next();
        ClientDTO clientDTO = new ClientDTO(Name, Number, Pass, balance);
        boolean result = bankRepository.save(clientDTO);
        if (result) {
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

    public void list() {
        System.out.print("계좌번호를 입력하세요 : ");
        String Number = scanner.next();
        boolean checkResult = bankRepository.NumberCheck(Number);
        if (checkResult) {
            ClientDTO clientDTO = bankRepository.list(Number);
            System.out.println(clientDTO.getClientName() + "님의 잔액은" + clientDTO.getBalance() + "입니다.");
        } else {
            System.out.println("없는 계좌번호입니다.");
        }

    }

    public void deposit() {
        System.out.print("입금하려는 계좌의 번호를 입력하세요 : ");
        String Number = scanner.next();
        boolean checkResult = bankRepository.NumberCheck(Number);
        if (checkResult) {
            System.out.print("입금할 금액을 입력하세요 : ");
            int deposit = 0;
            deposit = scanner.nextInt();
            ClientDTO clientDTO = bankRepository.deposit(Number, deposit);
            if (clientDTO != null) {
                System.out.println("입금 되었습니다.");
            } else {
                System.out.println("입금을 실패했습니다.");
            }
        } else {
            System.out.println("없는 계좌번호입니다.");
        }
    }

    public void withdraw() {
        System.out.print("출금하려는 계좌의 번호를 입력하세요 : ");
        String Number = scanner.next();
        boolean checkResult = bankRepository.NumberCheck(Number);
        System.out.println("비밀번호를 입력하세요 : ");
        String Pass = scanner.next();
        boolean checkResult2 = bankRepository.PassCheck(Pass);
        if (checkResult && checkResult2) {
            System.out.print("출금할 금액을 입력하세요 : ");
            int withdraw = 0;
            withdraw = scanner.nextInt();
            ClientDTO clientDTO = bankRepository.withdraw(Number, withdraw);
            if (clientDTO != null) {
                System.out.println("출금 되었습니다.");
            } else {
                System.out.println("출금을 실패했습니다.");
            }
        } else {
            System.out.println("없는 계좌번호입니다.");
        }
    }

    public void dwList() {

    }
}
