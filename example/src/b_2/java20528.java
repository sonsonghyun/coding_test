package b_2;
import java.util.*;

public class java20528 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] split = str.split(" ");
        char[][] c = new char[N][str.length()];
        boolean checked = true;


        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < split[i].length() ; j++) {
                c[i][j] = split[i].charAt(j);
            }
        }

        for(int i = 1 ; i < N  ; i++) {
            if (c[i-1][split[i-1].length()-1] != c[i][0]){
                checked = false;
            }
        }

        if (checked == true) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
