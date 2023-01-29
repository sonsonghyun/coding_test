import java.util.*;

public class java1157{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int apb[] = new int[26];
        String str = input.next();
        str = str.toUpperCase();
        for(int i=0; i<str.length(); i++){
            apb[str.charAt(i)-'A']++;
        }
        int max = 0, ans=0;
        for(int i=0; i<apb.length; i++){
            if(max < apb[i]){
                max = apb[i];
                ans = i;
            }
            else if(max == apb[i]){
                ans = -2;
            }
        }
        System.out.printf("%s", Character.toString(ans+'A'));
    }
}