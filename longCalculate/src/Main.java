import java.math.BigInteger;
import java.util.Scanner;

/*
* 문제
* 두 수 A, B를 입력받아, A+B, A-B, A×B를 구하는 프로그램을 작성하시오.
*
* 입력
* 첫째 줄에 A가, 둘째 줄에 B가 주어진다. 각각의 수는 10진수로 1,000자리를 넘지 않으며 양수와 음수가 모두 주어질 수 있다.
*
* 출력
* 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A×B를 출력한다. 각각을 출력할 때, 답이 0인 경우를 제외하고는 0으로 시작하게 해서는 안 된다(1을 01로 출력하면 안 된다는 의미).*/
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BigInteger A = scanner.nextBigInteger();
            BigInteger B = scanner.nextBigInteger();
            System.out.println(A.add(B));
            System.out.println(A.subtract(B));
            System.out.println(A.multiply(B));
        }
    }
}
