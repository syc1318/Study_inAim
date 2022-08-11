import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String star = "*";
        String star2 = star;
        for(int i = 1 ; i <T+1 ;i++){
            System.out.println(star2);
            star2 += star ;
        }
    }
}
