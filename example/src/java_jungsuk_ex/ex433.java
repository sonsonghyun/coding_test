package java_jungsuk_ex;
import java.util.*;

public class ex433 {
    public static void main(String[] args) {
        // Hashset과 다르게 Treeset은 정렬을 해줌
        Set set = new TreeSet();

        for(int i=0; set.size()<6; i++){
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        System.out.println(set);
    }
}
