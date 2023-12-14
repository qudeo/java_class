package my.ex01;

import ch10_class.ex6.MethodEx;

public class TvaMain {
    public static void main(String[] args) {
       Tva tva = new Tva();

        //method1 호출
        tva.Tva5(5, 6);

        //method2 호출
        int a = tva.tva();
        System.out.println("a = " + a);
        System.out.println(tva.tva());

        //method3 호출
        String b = tva.tva1();
        System.out.println("b = " + b);
        System.out.println(tva.tva1());

        // method4 호출 후 결과값 출력
        int c = tva.tva2();
        System.out.println("c = " + c);
        System.out.println(tva.tva2());

        // method5 호출
        tva.tva3("안녕", "하세요");

    }
}
