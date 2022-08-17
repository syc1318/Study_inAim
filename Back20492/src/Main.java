import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(Math.round(N*0.78) + " " + Math.round(N*0.8+ N*0.2*0.78));
    }
}
