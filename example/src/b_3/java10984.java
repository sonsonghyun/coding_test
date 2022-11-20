package b_3;

import java.util.*;

public class java10984 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for(int i=0; i<count; i++){
            int sec_count = in.nextInt();
            int sum = 0;
            float GPA = 0;
            for(int j=0; j<sec_count; j++){
                int a= in.nextInt();
                double b = in.nextDouble();
                sum += a;
                GPA += a*b;
            }

            System.out.println(sum+" "+ Math.round(GPA*10/sum)/10.0);
        }
    }
}