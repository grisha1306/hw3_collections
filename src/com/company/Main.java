package com.company;

import com.company.list.MyLinkedList;
import com.company.speedtest.perfomance.PerfomanceListCollection;
import com.company.speedtest.perfomance.PerfomanceMapsCollection;
import com.company.speedtest.perfomance.PerfomanceMyCollection;
import com.company.speedtest.perfomance.PerfomanceSetCollection;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();

        for (int i = 0; i <= 9; i ++ ) {
            integerMyLinkedList.add(i);
        }

        Integer[] ints = new Integer[5];
        System.out.println(integerMyLinkedList.get(2));
        integerMyLinkedList.add(1,10);

        System.out.println(integerMyLinkedList.indexOf(5));
        integerMyLinkedList.set(3,15);

//        integerMyLinkedList.remove(9);
        System.out.println(integerMyLinkedList);
        System.out.println(Arrays.toString(integerMyLinkedList.toArray()));
        integerMyLinkedList.toArray();
        integerMyLinkedList.toArray(ints);
        System.out.println(Arrays.toString(integerMyLinkedList.toArray(ints)));
//        integerMyLinkedList.clear();

//        ITERATOR
        System.out.println("Elements of my collection: ");
        Iterator myIterator = integerMyLinkedList.iterator();
        while (myIterator.hasNext()) {
            System.out.print(myIterator.next() + ", ");
        }
        System.out.println();
        System.out.println("Size of my collection is: " + integerMyLinkedList.size());

//        FileWriter writer1 = new FileWriter("./second_task/list/AmountOfNumbers" + ".txt");
//        FileWriter writer2 = new FileWriter("./second_task/map/AmountOfNumbers" + ".txt");
//        FileWriter writer3 = new FileWriter("./second_task/set/AmountOfNumbers" + ".txt");
//        FileWriter writer4 = new FileWriter("./first_task/AmountOfNumbers" + ".txt");
//        int size = 20000;
//        Integer[] integers = new Integer[size];
//        for (int i = 0; i < size; i++ ) {
//            integers[i] = i;
//            writer1.write(Integer.toString(i+1));
//            writer1.write(" ");
//            writer2.write(Integer.toString(i+1));
//            writer2.write(" ");
//            writer3.write(Integer.toString(i+1));
//            writer3.write(" ");
//            writer4.write(Integer.toString(i+1));
//            writer4.write(" ");
//        }
//        writer1.close();
//        writer2.close();
//        writer3.close();
//        writer4.close();


//        TEST MYCOLLECTION
//        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
//        PerfomanceMyCollection<Integer> integerPerfomanceMyCollection = new PerfomanceMyCollection<>(size);
//        integerPerfomanceMyCollection.addPerfomance(integerMyLinkedList,integers);
//        integerPerfomanceMyCollection.getPerfomance(integerMyLinkedList);
//        integerPerfomanceMyCollection.removePerfomance(integerMyLinkedList);

//        TEST LINKEDLIST COLLECTION
//        List<Integer> integerLinkedList = new LinkedList<>();
//        PerfomanceListCollection<Integer> integerPerfomanceListCollection = new PerfomanceListCollection<>(size);
//        integerPerfomanceListCollection.addPerfomance(integerLinkedList, integers);
//        integerPerfomanceListCollection.getPerfomance(integerLinkedList);
//        integerPerfomanceListCollection.removePerfomance(integerLinkedList);

//        TEST ARRAYLIST COLLECTION
//        List<Integer> integerArrayList = new ArrayList<>();
//        integerPerfomanceListCollection.addPerfomance(integerArrayList, integers);
//        integerPerfomanceListCollection.getPerfomance(integerArrayList);
//        integerPerfomanceListCollection.removePerfomance(integerArrayList);
//
////        TEST HASH_SET COLLECTION
//        Set<Integer> integerHashSet = new HashSet<>();
//        PerfomanceSetCollection<Integer> integerPerfomanceSetCollection = new PerfomanceSetCollection<>(size);
//        integerPerfomanceSetCollection.addPerfomance(integerHashSet, integers);
//        integerPerfomanceSetCollection.getPerfomance(integerHashSet, integers);
//        integerPerfomanceSetCollection.removePerfomance(integerHashSet, integers);
//
////        TEST LINKED_HASH_SET COLLECTION
//        Set<Integer> integerLinkedHashSet = new LinkedHashSet<>();
//        integerPerfomanceSetCollection.addPerfomance(integerLinkedHashSet, integers);
//        integerPerfomanceSetCollection.getPerfomance(integerLinkedHashSet, integers);
//        integerPerfomanceSetCollection.removePerfomance(integerLinkedHashSet, integers);
//
////        TEST TREE_SET COLLECTION
//        Set<Integer> integerTreeSet = new TreeSet<>();
//        integerPerfomanceSetCollection.addPerfomance(integerTreeSet, integers);
//        integerPerfomanceSetCollection.getPerfomance(integerTreeSet, integers);
//        integerPerfomanceSetCollection.removePerfomance(integerTreeSet, integers);
//
////      TEST HASH_MAP COLLECTION
//        Map<Integer, Integer> integerIntegerHashMap = new HashMap<>();
//        PerfomanceMapsCollection<Integer,Integer> integerIntegerPerfomanceMapsCollection = new PerfomanceMapsCollection<>(size);
//        integerIntegerPerfomanceMapsCollection.addPerfomance(integerIntegerHashMap,integers,integers);
//        integerIntegerPerfomanceMapsCollection.getPerfomance(integerIntegerHashMap,integers);
//        integerIntegerPerfomanceMapsCollection.removePerfomance(integerIntegerHashMap,integers);
//
////      TEST LINKED_HASH_MAP COLLECTION
//        Map<Integer, Integer> integerIntegerLinkedHashMap = new LinkedHashMap<>();
//        integerIntegerPerfomanceMapsCollection.addPerfomance(integerIntegerLinkedHashMap,integers,integers);
//        integerIntegerPerfomanceMapsCollection.getPerfomance(integerIntegerLinkedHashMap,integers);
//        integerIntegerPerfomanceMapsCollection.removePerfomance(integerIntegerLinkedHashMap,integers);
//
////      TEST TREE_MAP COLLECTION
//        Map<Integer, Integer> integerIntegerMap = new TreeMap<>();
//        integerIntegerPerfomanceMapsCollection.addPerfomance(integerIntegerMap,integers,integers);
//        integerIntegerPerfomanceMapsCollection.getPerfomance(integerIntegerMap,integers);
//        integerIntegerPerfomanceMapsCollection.removePerfomance(integerIntegerMap,integers);
    }
}
