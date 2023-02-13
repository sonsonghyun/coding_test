import java.util.*;

public class java6996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++)
        {
            String wordA = sc.next();
            String wordB = sc.next();
            isAnagram(wordA,wordB);
        }

    }
    public static void isAnagram(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if(Arrays.equals(charArray1, charArray2))
            System.out.println(str1+ " & " +str2+ " are anagrams.");
        else
            System.out.println(str1+ " & " +str2+ " are NOT anagrams.");


    }
}