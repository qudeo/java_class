package my.Text_RPG.service;

import java.util.Scanner;

public class ClassService {
    Scanner scanner = new Scanner(System.in);

    public void information() {
        System.out.println("== 직업 정보 ==");
        System.out.println("직업 : 외노자");
        System.out.println("공격력이 강한 직업입니다.");
        System.out.println("스킬 : ");
        System.out.println("스킬설명 : 노동의 힘을 발휘해 대상을 2번 타격합니다.");
        System.out.println("직업설명 : 30년간 노동으로 인하여 매우 쇠약해진 상태입니다.");
    }
}
