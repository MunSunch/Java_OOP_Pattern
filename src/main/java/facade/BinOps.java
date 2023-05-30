package facade;

public class BinOps {
    public String sum(String a, String b) {
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(arg1+arg2);
    }

    public String mult(String a, String b) {
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(arg1*arg2);
    }
}