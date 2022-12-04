package java_jungsuk_ex;
import java.util.*;

public class ex565 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++)
            list.add(i);

        //list 모든 요소를 출력
        list.forEach(i-> System.out.print(i+","));
        System.out.println();

        list.removeIf(x-> x%2==0 || x%3==0);
        System.out.println(list);

        list.replaceAll(i->i*10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");

        map.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
        System.out.println();
    }
}
