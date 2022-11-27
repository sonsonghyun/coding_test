package java_jungsuk_ex;

import java.util.*;

public class ex337 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-",arr));

        StringJoiner sj = new StringJoiner("/");
        for(String s : arr)
            sj.add(s);
        System.out.println(sj.toString());
    }
}
