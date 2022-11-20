package b_3;

import java.util.*;

public class java10102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v = in.nextInt();
        String str = in.next();
        char[] c = new char[str.length()];
        int[] index = new int[2];

        for(int i=0; i<str.length(); i++){
            c[i]=str.charAt(i);
            if(c[i]=='A'){
                index[0]++;
            }
            else if(c[i]=='B'){
                index[1]++;
            }
        }
        if(index[0]>index[1])
            System.out.println("A");
        else if(index[0]<index[1])
            System.out.println("B");
        else if(index[0]==index[1])
            System.out.println("Tie");
    }
}