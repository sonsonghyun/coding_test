import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int[] list = new int[count];
        for(int i=0; i<count; i++){
            int a = in.nextInt();
            list[i] = a;
        }

        int max = list[count-1];
        int sum = 1;

        for(int j=0; j<count; j++){
            if(list[j]>max)
                sum++;
        }
        System.out.println(sum);
    }
}