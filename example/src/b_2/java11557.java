package b_2;

import java.util.Scanner;

public class java11557 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test_case = in.nextInt();
        for(int i=0; i<test_case; i++){
            int count = in.nextInt();
            int[] list1 = new int[count];
            String[] list2 = new String[count];
            for(int j=0; j<count; j++){
                list2[j] = in.next();
                list1[j] = in.nextInt();
            }
            int max = list1[0];
            int idx = 0;

            for(int k=0; k<count; k++){
                if(list1[k]>max){
                    max=list1[k];
                    idx=k;
                }
            }
            System.out.println(list2[idx]);
        }
    }
}
