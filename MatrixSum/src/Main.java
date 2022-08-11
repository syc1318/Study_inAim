import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            int[][] rowN = new int[N][];

            int[][] rowN2 = new int[N][];
            for(int i = 0 ; i<N;i++){
                int[] colM = new int[M];
                for(int j = 0 ; j<M;j++){
                    colM[j] = scanner.nextInt();
                }
                rowN[i] = colM;
            }
            for(int i = 0 ; i< N ;i++){
                int[] colM2 = new int[M];
                for(int j = 0 ; j<M;j++){
                    colM2[j] = scanner.nextInt();
                }
                rowN2[i] = colM2;
            }


            int[][] resRow = new int[N][];
            for(int i = 0 ; i<N;i++){
                int[] resCol = new int[M];
                for(int j = 0 ; j<M;j++){
                    resCol[j] = rowN[i][j] + rowN2[i][j];
                }
                resRow[i] = resCol;
            }
            for(int i = 0 ; i<N;i++){
                for(int j = 0 ; j<M;j++){
                    System.out.print(resRow[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
