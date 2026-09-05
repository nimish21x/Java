package com.nimish.CollectionFramework;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(50);
        System.out.println(list2);

        //addAll
        list.addAll(list2);

        System.out.println("list + list2 : " + list);

        //remove
        list.remove(3);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

        //size
        System.out.println("Size of list :" + list.size());

        //get
        System.out.println(list.get(2));

        //set
        list.set(2, 35);
        System.out.println(list);

        //contains
        System.out.println(list.contains(35));

    }
}
