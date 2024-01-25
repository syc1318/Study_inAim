import java.util.Scanner;

//test
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int p = scanner.nextInt();
        int pp = l * p;
        for (int i = 0; i < 5; i++) {
            int a = scanner.nextInt();
            System.out.println(a - pp);
        }
    }
}
