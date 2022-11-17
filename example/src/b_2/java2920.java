package b_2;

import java.util.Scanner;

public class java2920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] name = new String[20];

        int count = 8;
        int x=0;
        int y=0;
        int z=0;
        int[] list = new int[8];

        for(int i=0; i<count; i++){
            list[i] = in.nextInt();
        }

        for(int j=0; j<count; j++){
            if(list[j]==j+1)
                x++;
            else if(list[j]==8-j)
                y++;
            else
                z++;
        }
        if(x==8)
            System.out.println("ascending");
        else if(y==8)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
