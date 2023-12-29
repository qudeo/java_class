package my.Text_RPG.dto;

import java.util.Scanner;

public class Nodongja extends CharacterDTO {
    Scanner scanner = new Scanner(System.in);
    public int attack() {

        System.out.println("1.일반공격");
        System.out.println("2.스킬공격");
        System.out.println("공격 번호를 입력하세요 : ");
        int num = scanner.nextInt();
        int sum = 0;

        if (num == 1) {
            sum+= level * 15;
            sum+= att * 15;
            sum+= def * 15;
            System.out.println("데미지는 " + sum + " 입니다.");
            return sum;
        } else if (num == 2) {
            sum+= level * 10;
            sum+= att * 20;
            sum+= def * 10;
            mp = mp - 5;
            System.out.println("데미지는 " + sum + " 입니다.");
            return sum;
        }
        System.out.println("데미지는 " + sum + " 입니다.");
        return num;
    }
    public void attacked (int sum) {

        if (def >= sum) {
            hp = hp - 0;
        } else {
            hp = hp + def - sum;
        }
    }
}
