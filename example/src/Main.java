import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int[] list = new int[count];
        int sum = 1;
        int max = 0;
        int max_idx = 0;
        for (int i = 0; i < count; i++) {
            list[i] = in.nextInt();
            if (list[i] > max) {
                max = list[i];
                max_idx = i;
                System.out.println(max_idx);
            }
        }

        for (int j = 0; j < count; j++) {
            if (j >= max_idx && list[j]>list[count-1])
                sum++;
        }
        System.out.println(sum);
    }
}













