import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A+B);
        }
    }
}
