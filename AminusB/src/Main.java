/*
*문제
* 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
*
* 입력
* 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
*
* 출력
* 첫째 줄에 A-B를 출력한다.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
//            int A = scanner.nextInt();
//            int B = scanner.nextInt();
//            System.out.println(A-B);
            int N = scanner.nextInt();
            for(int i = N; i > 0; i--) {
                System.out.println("*".repeat(i));
            }
        }
    }
}
