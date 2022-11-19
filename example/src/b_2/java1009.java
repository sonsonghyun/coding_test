package b_2;

import java.util.Scanner;

public class java1009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for(int i=0; i<count; i++){
            int a= in.nextInt();
            int b= in.nextInt();
            int c= 1;
            for(int j=0; j<b; j++){
                c=(c*a)%10;
                if(c==0)
                    c=10;
            }
            System.out.println(c);
        }
    }
}
