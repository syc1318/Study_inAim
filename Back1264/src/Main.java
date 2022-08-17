import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int cnt = 0;
            String sent = scanner.nextLine();
            char[] ch = sent.toCharArray();
            if(sent.equals("#")){
                return;
            }else{
                for(char c : ch){

                    if(c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i'||c == 'A' || c == 'E' || c == 'O' || c == 'U' || c == 'I')
                        cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}
