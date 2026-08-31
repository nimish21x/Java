package com.nimish;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>();

        //functions
//        list.add(5);
//        list.add(4);
//        list.add(3);
//        list.add(2);
//        list.add(1);

        for (int i = 0; i < 5; i++ ){
            list.add(sc.nextInt());
        }

        list.set(2, 5);
        list.remove(2);

        //output
        System.out.println(list);
    }
}
