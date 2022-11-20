package b_3;

import java.util.*;

public class java10214 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        for(int i=0; i<count; i++){
            int y_score = 0;
            int k_score = 0;
            for(int j=0; j<9; j++){
                int a = in.nextInt();
                int b = in.nextInt();
                y_score += a;
                k_score += b;
            }
            if(y_score > k_score)
                System.out.println("Yonsei");
            else if(y_score < k_score)
                System.out.println("Korea");
            else if(y_score == k_score)
                System.out.println("Draw");
        }
    }
}
