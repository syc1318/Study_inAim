import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for(int i = 97; i < 123; i++) {
            if(i==122){
                System.out.print(s.indexOf(i));
            }
            else{
                System.out.print(s.indexOf(i)+" ");
            }

        }
    }
}
