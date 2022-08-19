import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int sub = scanner.nextInt();
        if(sum<sub){
            System.out.println(-1);
        }
        if((sum+sub)%2==0||(sum-sub)%2==0){
            int a = (sum+sub)/2;
            int b = (sum-sub)/2;
            System.out.println(a+" "+b);
        }
        else{
            System.out.println(-1);
        }


    }
}
