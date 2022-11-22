package b_2;

import java.util.Scanner;

public class java15969 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int[] list = new int[count];

        int max = 0;
        int min = 1000;
        for(int i=0; i<count; i++){
            int a = in.nextInt();
            list[i]=a;
        }
        for(int j=0; j<count; j++){
            if(list[j]>max)
                max = list[j];
            if(list[j]<min)
                min = list[j];
        }
        System.out.println(max-min);
    }
}
