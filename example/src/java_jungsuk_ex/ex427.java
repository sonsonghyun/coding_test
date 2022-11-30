package java_jungsuk_ex;

import java.util.*;

public class ex427 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));
        System.out.println(set);
    }
}

class Person{
    String name;
    int age;

    public boolean equals(Object obj){
        if(!(obj instanceof Person)) return false;
        Person p = (Person)obj;
        return name.equals(p.name) && age==p.age;
    }
    public int hashCode(){
        return Objects.hash(name,age);
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+":"+age;
    }
}
