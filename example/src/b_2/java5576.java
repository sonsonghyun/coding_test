package b_2;
import java.util.*;

public class java5576 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] list1 = new int[10];
        int[] list2 = new int[10];

        for(int i=0; i<10; i++){
            list1[i] = in.nextInt();
        }
        for(int j=0; j<10; j++){
            list2[j] = in.nextInt();
        }
        Arrays.sort(list1);
        Arrays.sort(list2);
        int sum = list1[7]+list1[8]+list1[9];
        int sum2 = list2[7]+list2[8]+list2[9];
        System.out.println(sum+" "+sum2);
    }
}
