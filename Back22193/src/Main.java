import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        System.out.println(A.multiply(B));
    }
}
