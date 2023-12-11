package ch09_array;

import java.util.Objects;
import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int[] num = null;
        int max = 0;
        int jum = 0;


        while (run) {
            System.out.println("---------------------------------------------------");
            System.out.println("1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
            System.out.println("---------------------------------------------------");
            System.out.print("선택 > ");
            int t = scanner.nextInt();

            if (t == 1) {
                System.out.print("학생수 > ");
                int h = scanner.nextInt();
                if (h > 0) {
                    num = new int[h];
                }

            } else if (t == 2) {

                for (int i = 0; i < num.length; i++){
                    System.out.print( (i+1) + "번 학생 점수 : ");
                    jum = scanner.nextInt();
                    num[i] = jum;
                }

            } else if (t == 3){

                for (int i = 0; i < num.length; i++) {
                    System.out.println( (i+1) +"번 학생 점수 : " + num[i]);
                }

            } else if (t == 4) {
                int sum = 0;
                double sum2 = 0;

                for (int i = 0; i < num.length; i++){
                    if (max < num[i]){
                        max = num[i];
                    }
                    sum += num[i];
                }
                sum2 = sum / num.length;
                sum2 = (double) sum / num.length;
                System.out.println("최고 점수 : " + max);
                System.out.println("평균 점수 : " + sum2);

                int a = 0;
                for (int i = 0; i < num.length; i++){
                    for (int j = i + 1; j < num.length; j++){
                        if (num[i] < num[j]){
                            a = num[i];
                            num[i] = num[j];
                            num[j] = a;
                        }
                    }System.out.println( (i + 1) + "등 : " + num[i]);
                }

            } else if (t == 5) {
                System.out.println("종료합니다.");
                run = false;

            } else {
                System.out.println("메뉴는 1부터 5까지밖에 없습니다.");

            }

        }
    }
}
