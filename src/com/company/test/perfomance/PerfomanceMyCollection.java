package com.company.test.perfomance;

import com.company.collections.mylist.ILinkedList;

import java.io.FileWriter;
import java.io.IOException;

public class PerfomanceMyCollection<T> {

    private long startTime;
    private long endTime;
    private long estimatedTime;
    private int size;

    public PerfomanceMyCollection(int size) {
        this.size = size;
    }

    public void addPerfomance (ILinkedList<T> list, T[] t) {
        String fileName = list.getClass().toString();
        try {
            FileWriter writer = new FileWriter("./first_task/add" + fileName + ".txt");
            long[] arrayForEstimatedTime = new long[size];

            int halfOFSize = (int) size / 2;
            for (int i = 0; i < halfOFSize; i++) {
                startTime = System.nanoTime();
                list.add(t[i]);
                endTime = System.nanoTime();
                estimatedTime = endTime - startTime;
                arrayForEstimatedTime[i] = estimatedTime;
                writer.write(Long.toString(arrayForEstimatedTime[i]));
                writer.write(" ");
            }

            for (int i = halfOFSize; i < size; i++) {
                startTime = System.nanoTime();
                list.add(halfOFSize, t[i]);
                estimatedTime = System.nanoTime() - startTime;
                arrayForEstimatedTime[i] = estimatedTime;
                writer.write(Long.toString(arrayForEstimatedTime[i]));
                writer.write(" ");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getPerfomance (ILinkedList<T> list)  {
        String fileName = list.getClass().toString();
        try {
        FileWriter writer = new FileWriter("./first_task/get" + fileName + ".txt");
        long[] arrayForEstimatedTime = new long[size];

        for (int i = 0; i < size; i++) {
            startTime = System.nanoTime();
            list.get(i);
            endTime = System.nanoTime();
            estimatedTime = endTime - startTime;
            arrayForEstimatedTime[i] = estimatedTime;
            writer.write(Long.toString(arrayForEstimatedTime[i]));
            writer.write(" ");
        }
        writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removePerfomance (ILinkedList<T> list)  {
        String fileName = list.getClass().toString();
        try {
        FileWriter writer = new FileWriter("./first_task/remove" + fileName + ".txt");
        long[] arrayForEstimatedTime = new long[size];

        for (int i = 0; i < size; i++) {
            startTime = System.nanoTime();
            list.remove((int)list.size()/2);
            endTime = System.nanoTime();
            estimatedTime = endTime - startTime;
            arrayForEstimatedTime[i] = estimatedTime;
            writer.write(Long.toString(arrayForEstimatedTime[i]));
            writer.write(" ");
        }
        writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
