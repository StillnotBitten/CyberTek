package day36_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections_Practice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(15);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i=list.size()-1;i>=0;i--){

            list1.add(list.get(i));
        }
        System.out.println(list1);
    }

}
