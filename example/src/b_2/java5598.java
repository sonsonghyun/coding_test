package b_2;

import java.util.Scanner;

public class java5598 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        char[] list = new char[a.length()];
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)-3<'A')
                list[i]=(char)(a.charAt(i)+23);
            else
                list[i]=(char)(a.charAt(i)-3);
        }
        for(int j=0; j<a.length(); j++)
            System.out.print(list[j]);
    }
}
