import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String string = scanner.nextLine();
            char[] sent = new char[string.length()];
            for(int i = 0;i<string.length();i++){
                sent[i] = string.charAt(i);
                if(sent[i]>90){
                    sent[i] -= 32;
                }else {
                    sent[i] += 32;
                }
            }
            for(int i = 0 ; i < string.length();i++){
                System.out.print(sent[i]);
            }

        }
    }
}
