import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()){
                int N = scanner.nextInt();
                int S = scanner.nextInt();
                System.out.println(S / (N+1));
            }
        }
    }
}
