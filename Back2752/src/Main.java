import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] N = new int[3];
        N[0] =scanner.nextInt();
        N[1] =scanner.nextInt();
        N[2] =scanner.nextInt();
        for (int i = 1; i < N.length; i++) {
            for(int j = 0; j < N.length-i; j++) {
                if(N[j]>N[j+1]) {
                    int tmp = N[j];
                    N[j] = N[j+1];
                    N[j+1] = tmp;
                }
            }
        }
        System.out.println(N[0]+" "+N[1]+" "+N[2]);
    }
}
