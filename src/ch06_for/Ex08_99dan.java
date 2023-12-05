package ch06_for;

public class Ex08_99dan {
    public static void main(String[] args) {

        for(int a = 2; a <= 9; a++){
            System.out.println(a + "단");
            for(int b = 2; b <= 9; b++){
                if(b < 9){
                    System.out.print(a + " * " + b + " = " + a * b + "   ");
                }else{
                    System.out.println(a + " * " + b + " = " + a * b + "   ");
                }
            }
        }
    }
}
