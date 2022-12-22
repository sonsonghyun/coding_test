package b_2;

import java.util.*;

public class java10804 {
    static ArrayList<Integer> cards = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<21; i++) cards.add(i);
        for (int i=0; i<10; i++) reverse(sc.nextInt(), sc.nextInt());
        for (int i : cards) System.out.print(i + " ");

    }
    static void reverse(int start, int end){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i=start; i<=end; i++)
            temp.add(cards.remove(start-1));
        for (int i : temp)
            cards.add(start-1, i);
    }
}