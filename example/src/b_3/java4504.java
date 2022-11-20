package b_3;

import java.util.*;

public class java4504 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        while(true){
            int a =in.nextInt();
            if(a==0)
                break;

            if((a%count)==0){
                System.out.println(a+" is a multiple of "+count+".");
            }else{
                System.out.println(a+" is NOT a multiple of "+count+".");
            }
        }
    }
}