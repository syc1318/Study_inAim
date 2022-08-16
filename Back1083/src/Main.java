/*
* 문제
* 크기가 N인 배열 A가 있다.
* 배열에 있는 모든 수는 서로 다르다.
* 이 배열을 소트할 때, 연속된 두 개의 원소만 교환할 수 있다.
* 그리고, 교환은 많아봐야 S번 할 수 있다.
* 이때, 소트한 결과가 사전순으로 가장 뒷서는 것을 출력한다.

* 입력
* 첫째 줄에 N이 주어진다. N은 50보다 작거나 같은 자연수이다.
* 둘째 줄에는 각 원소가 차례대로 주어진다. 이 값은 1000000보다 작거나 같은 자연수이다.
* 마지막 줄에는 S가 주어진다. S는 1000000보다 작거나 같은 음이 아닌 정수이다.

* 출력
* 첫째 줄에 문제의 정답을 출력한다.

* 예제 입력 1
7
10 20 30 40 50 60 70
1
예제 출력 1
20 10 30 40 50 60 70
*
예제 입력 2
5
3 5 1 2 4
2
예제 출력 2
5 3 2 1 4
*
예제 입력 3
10
19 20 17 18 15 16 13 14 11 12
5
예제 출력 3
20 19 18 17 16 15 14 13 12 11
* */

import java.util.Scanner;

public class Main {
    public static int[] sort(int[] N, int cnt){
        for(int i=0; i<N.length; i++){
            if(i==N.length-1)
                break;
            if(N[i] < N[i+1]){
                int tmp = N[i];
                N[i] = N[i+1];
                N[i+1] = tmp;
                cnt--;
            }
            if(cnt ==0)
                break;
        }
        return N;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int S = scanner.nextInt();
        int[] res = new int[N];
        res = sort(A,S);
        for(int i = 0; i < res.length; i++) {
            if(i != res.length-1){
                System.out.print(res[i]);
            }
            else{
                System.out.print(res[i]+" ");
            }

        }
    }
}
