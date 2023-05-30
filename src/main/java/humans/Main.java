package humans;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.of(11);
        System.out.println(op.get());
    }
}
