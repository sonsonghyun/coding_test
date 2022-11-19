package b_2;

import java.util.Scanner;

public class java1100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] list = new char[8];
        char [] list2 = new char[8];
        int sum = 0;
        for(int i=0; i<8; i++){
            String a = in.next();
            for(int j=0; j<a.length(); j++){
                if((i%2)==0){
                    list[j]=a.charAt(j);
                    if((j%2)==0 && list[j]=='F')sum++;
                }
                else if((i%2)!=0){
                    list2[j]=a.charAt(j);
                    if((j%2)!=0 && list2[j]=='F') sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
