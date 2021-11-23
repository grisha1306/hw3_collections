package com.company.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();

        for (int i = 0; i <= 9; i ++ ) {
            integerMyLinkedList.add(i);
        }

        for (int i = 0; i <= 9; i ++ ) {
            System.out.print(integerMyLinkedList.get(i) + ", ");
        }
        System.out.println();
        Object[] ints = new Object[1];
        System.out.println(integerMyLinkedList.get(2));
        integerMyLinkedList.add(1,10);
        System.out.println(integerMyLinkedList.indexOf(5));
        integerMyLinkedList.set(3,15);
        System.out.println(Arrays.toString(integerMyLinkedList.toArray()));
        integerMyLinkedList.remove(9);
        System.out.println(Arrays.toString(integerMyLinkedList.toArray()));
        System.out.println(Arrays.toString(integerMyLinkedList.toArray(ints)));
        System.out.println(integerMyLinkedList);
//        integerMyLinkedList.clear();

//        ITERATOR
        System.out.println("Elements of my collection: ");
        Iterator myIterator = integerMyLinkedList.iterator();
        while (myIterator.hasNext()) {
            System.out.print(myIterator.next() + ", ");
        }

        System.out.println();
        System.out.println("Size of my collection is: " + integerMyLinkedList.size());

    }
}
