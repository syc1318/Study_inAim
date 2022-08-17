import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals("# 0 0")){
                break;
            }
            String[] list = line.split(" ");
            String name = list[0];
            String year = list[1];
            String weight = list[2];
            if(Integer.parseInt(year)>17 || Integer.parseInt(weight)>=80){
                System.out.println(name + " Senior");
            }else{
                System.out.println(name + " Junior");
            }
        }
    }
}
