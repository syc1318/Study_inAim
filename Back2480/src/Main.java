import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int mon = 0;
        if(a==b && a==c){
            mon = 10000 + a*1000;
        } else if (a !=b && a !=c && b !=c) {
            int max = a;
            if(max<b){
                max = b;
            }
            if(max < c){
                max = c;
            }
            mon = max*100;
        }else{
            int sm = 0;
            if(a==b){
                sm = a;
            }else if(a==c){
                sm = a;
            }else if(b==c){
                sm = b;
            }
            mon = 1000+ sm*100;

        }
        System.out.println(mon);
    }
}
