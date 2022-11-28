package b_2;

import java.util.Scanner;

public class java10093 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();
        long k = Math.abs(b-a)-1;
        System.out.println(k);
        for(int i=0; i<k; i++){
            if(a>b){
                b++;
                System.out.print(b+" ");
            }
            else if(b>a){
                a++;
                System.out.print(a+" ");
            }
            else if(a==b)
                System.out.print(0);
        }
    }
}
