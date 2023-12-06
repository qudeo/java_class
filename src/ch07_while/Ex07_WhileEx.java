package ch07_while;

public class Ex07_WhileEx {
    public static void main(String[] args) {
        /*
         * 1 + (-2) + 3 + (-4) + 5 + (-6) ~~~
         * 처럼 계산을 했을 때 합계가 100이 됐을 때의 숫자를 출력
         * 정답 : 199
         **/

        int sum = 0;
        int i = 0;

        while (sum != 100) {
            i++;
            if(i % 2 == 0){
                sum = sum - i;
            }else {
                sum = sum + i;
            }
        }
        System.out.println(i);
    }
}
