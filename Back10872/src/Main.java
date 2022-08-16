import java.util.Scanner;

public class Main {
    public static int fact(int N){
        if(N==0) return 1;
        return N*fact(N-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(fact(N));
    }
}
