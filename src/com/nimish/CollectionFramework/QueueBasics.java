package com.nimish.CollectionFramework;
import java.util.Queue;
import java.util.LinkedList;

public class QueueBasics {
    public static void main(String[] args) {

        Queue<Integer> Q = new LinkedList<>();

        Q.offer(10);
        Q.offer(20);
        Q.offer(30);

        System.out.println(Q);

        System.out.println(Q.peek());

        System.out.println("Removing: "+ Q.poll());
        System.out.println(Q);

        System.out.println("Removing: "+ Q.poll());
        System.out.println(Q);

        System.out.println("Removing: "+ Q.poll());
        System.out.println(Q);


    }
}
