package java_jungsuk_ex;

import java.util.*;

public class ex425 {
    public static void main(String[] args) {
        Object[] objArr = {"1",new Integer(1), "2","2","3","3","4","4","4"};
        Set set = new HashSet();
        for(int i=0; i<objArr.length; i++){
            set.add(objArr[i]);
        }
        System.out.println(set);

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
