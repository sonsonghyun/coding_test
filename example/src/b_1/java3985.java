import java.util.Scanner;

public class java3985 {

    public static void main(String[] args) {

        int people1=0;
        int max = 0;

        int maxSum = Integer.MIN_VALUE;
        int people2=0;
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int N = sc.nextInt();

        int cake[] = new int[L];
        for(int i=0;i<N;i++) {
            int P = sc.nextInt();
            int K = sc.nextInt();
            int sum = 0;
            if((K-P)>max) {
                max = (K-P);
                people1 = i+1;
            }
            for(int j=P-1;j<K;j++) {
                if(cake[j]==0) {
                    cake[j] = (i+1);
                    sum++;
                }
            }
            if(sum > maxSum) {
                people2 = (i+1);
                maxSum = sum;
            }
        }
        System.out.println(people1);
        System.out.println(people2);
    }
}