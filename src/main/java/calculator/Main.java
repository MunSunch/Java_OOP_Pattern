package calculator;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();

        //sum
        int expected1 = 11;
        int actual1 = calc.sum(5,6);
        System.out.println("sum: " + (expected1==actual1));

        //mult
        int expected2 = 99;
        int actual2 = calc.mult(11, 9);
        System.out.println("mult: " + (expected2==actual2));

        //pow
        int expected3 = 1000;
        int actual3 = calc.pow(10, 3);
        System.out.println("pow: " + (expected3==actual3));
    }
}
