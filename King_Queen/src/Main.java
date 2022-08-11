import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int[] chess = new int[6];
            int[] newpiece = new int[6];
            chess[0] =1;
            chess[1] =1;
            chess[2] =2;
            chess[3] =2;
            chess[4] =2;
            chess[5] =8;
            for(int i = 0 ; i <6 ;i++){
                newpiece[i] = scanner.nextInt();
            }
            for(int i = 0 ; i <6 ;i++){
                System.out.print(chess[i] - newpiece[i]);
            }
        }
    }
}
