import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hh = scanner.nextInt();
        int mm = scanner.nextInt();
        int ss = scanner.nextInt();
        int t = scanner.nextInt();
        ss +=t;
        while(ss >=60){
            mm++;
            ss -= 60;
            while(mm>=60){
                hh++;
                mm -= 60;
                if(hh>=24){
                    hh-=24;
                }
            }
        }
        System.out.println(hh + " "+mm + " "+ss);
    }
}
