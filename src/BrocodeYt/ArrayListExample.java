package BrocodeYt;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(22);
        list.add(4);
        list.add(100);

        list.remove(1);
        list.set(0,999);

        Collections.sort(list);

        System.out.println(list);
    }
}
