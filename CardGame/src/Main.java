import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int score = 0;
            for(int i = 0 ; i <5;i++){
                score += scanner.nextInt();
            }
            System.out.println(score);
        }
    }
}
