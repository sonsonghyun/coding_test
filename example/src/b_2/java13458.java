package b_2;

import java.util.Scanner;

public class java13458 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int room = in.nextInt();
        int[] list = new int[room];

        for(int i=0; i<room; i++){
            int a = in.nextInt();
            list[i]=a;
        }
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int t1 =0;
        long sum = 0;
        for(int j=0; j<room; j++){
            int k = list[j]-a1;
            sum+=1;
            if(k<0){
                t1=1;
                sum+=t1;
            }
            else{
                if((k%a2)==0){
                    t1=k/a2;
                    sum+=t1;
                }
                else{
                    t1=(k/a2)+1;
                    sum+=t1;
                }
            }
        }
        System.out.println(sum);
    }
}
