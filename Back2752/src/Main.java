import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] N = new int[3];
        N[0] =scanner.nextInt();
        N[1] =scanner.nextInt();
        N[2] =scanner.nextInt();
        if(N[0]>N[1]){
            int tmp = N[0];
            N[0] = N[1];
            N[1] = tmp;
        }
        if(N[1]>N[2]){
            int tmp = N[1];
            N[1] = N[2];
            N[2] = tmp;
        }
        if(N[2]>N[0]){
            int tmp = N[2];
            N[2] = N[0];
            N[0] = tmp;
        }
    }
}
