package my.ex01;

public class Tva {
    // 매개변수 x, 리턴 x
    public void Tva() {

    }
    // 매개변수 O, 리턴 X
    public void Tva5(int a, int b) {
        int result = 0;
        result = a + b;
        System.out.println("result = " + result);
    }

    // 매개변수 X, 리턴 O
    public int tva() {
        int a = 3;
        int b = 4;
        int result = 0;
        result = a + b;
        return  result;
    }

    // 리턴 String
    public String tva1() {
        String str = "안녕하세요";
        return str;
    }

    // 리턴 int
    public int tva2() {
        int a = 6;
        int b = 7;
        return a * b;
    }


    // 매개변수 O, 리턴 X
    public void tva3(String a, String b) {
        System.out.println("a = " + a + ", b = " + b);
    }

}