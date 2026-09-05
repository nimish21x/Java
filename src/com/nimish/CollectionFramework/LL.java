package com.nimish.CollectionFramework;
import java.util.LinkedList;


public class LL {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        System.out.println(list.contains (20));

        System.out.println(list.indexOf(20));

        System.out.println(list.lastIndexOf(30));

        list.remove(1);

        System.out.println(list);

        list.clear();

        System.out.println(list);

    }
}
