package facade;

public class Main {
    public static void main(String[] args) {
        BinOps bin = new BinOps();

        //sum
        String expected1 = "1010";
        String actual1 = bin.sum("111", "11");
        System.out.println("sum: " + (expected1.equals(actual1)));

        //mult
        String expected2 = "1010";
        String actual2 = bin.mult("10", "101");
        System.out.println("mult: " + (expected2.equals(actual2)));
    }
}
