package b_3;

import java.util.Arrays;
import java.util.Scanner;

public class java3047 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[3];

        array[0] = scan.nextInt();
        array[1] = scan.nextInt();
        array[2] = Integer.parseInt(scan.nextLine().trim());

        String str = scan.nextLine();

        Arrays.sort(array);

        for (int i = 0; i < 3; i++) {
            char c = str.charAt(i);

            if (c == 'A')
                System.out.print(array[0] + " ");
            if (c == 'B')
                System.out.print(array[1] + " ");
            if (c == 'C')
                System.out.print(array[2] + " ");
        }

        scan.close();
    }
}
