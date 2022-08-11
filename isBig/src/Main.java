import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true){
                int N = scanner.nextInt();
                int M = scanner.nextInt();
                if(N == 0 && M ==0){
                    break;
                }
                if(N > M){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
