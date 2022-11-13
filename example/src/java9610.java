import java.util.*;

public class java9610 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;
        int axis=0;

        for(int i=0; i<count; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if(a>0 && b>0)
                q1++;
            else if(a<0 && b>0)
                q2++;
            else if(a<0 && b<0)
                q3++;
            else if(a>0 && b<0)
                q4++;
            else
                axis++;
        }
        System.out.println("Q1: "+q1);
        System.out.println("Q2: "+q2);
        System.out.println("Q3: "+q3);
        System.out.println("Q4: "+q4);
        System.out.println("AXIS: "+axis);
    }
}