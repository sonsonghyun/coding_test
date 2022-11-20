package b_2;

import java.util.Scanner;

public class java10820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNextLine()) {
            String str = in.nextLine();

            int small_num = 0;
            int large_num = 0;
            int number = 0;
            int space_num = 0;
            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);
                if(ch >='a' && ch <= 'z') small_num ++;
                else if(ch >= 'A' && ch <= 'Z') large_num++;
                else if(ch >= '0' && ch <= '9') number++;
                else space_num++;
            }
            System.out.println(small_num + " " + large_num + " " + number + " " + space_num);
        }
    }
}
