package ch07_while;

public class Ex02_WhileEx {
    public static void main(String[] args) {
        /**
         * while 문으로 1부터 10까지의 합계 출력
         * 출력
         * 1+2+3+4+5+6+7+8+9+10=55
         */
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum = sum + i;

            if (i < 10) {
                System.out.print(i+"+");
                i++;
            }else {
                System.out.print(i+"=");
                break;
            }
        }
        System.out.println(sum);

    }
}
