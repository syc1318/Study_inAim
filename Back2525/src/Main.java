import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hh = scanner.nextInt();
        int mm = scanner.nextInt();
        int cc = scanner.nextInt();
        if(mm +cc >=60){
            mm +=cc;
            while(mm>=60){
                hh++;
                if(hh>=24){
                    hh-=24;
                }
                mm -= 60;
            }
        }
        else{
            mm = mm+cc;
        }
        System.out.println(hh+" "+mm);

    }
}
