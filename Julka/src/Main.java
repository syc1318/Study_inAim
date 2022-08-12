import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger C = sc.nextBigInteger();
        BigInteger N = sc.nextBigInteger();
        BigInteger two = new BigInteger("2");
        System.out.println(C.subtract(N).divide(two).add(N));
        System.out.println(C.subtract(N).divide(two));
    }
}
