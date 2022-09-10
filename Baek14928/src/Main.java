import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger big = scanner.nextBigInteger();
        System.out.println(big.mod(BigInteger.valueOf(20000303) ));
    }
}
