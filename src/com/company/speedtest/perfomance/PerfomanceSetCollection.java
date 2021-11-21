package com.company.speedtest.perfomance;

import com.company.list.ILinkedList;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class PerfomanceSetCollection<T> {
    private long startTime;
    private long endTime;
    private long estimatedTime;
    private int size;

    public PerfomanceSetCollection(int size) {
        this.size = size;
    }

    public void addPerfomance (Set<T> set, T[] t) throws IOException {
        String fileName = set.getClass().toString();
        FileWriter writer = new FileWriter("./second_task/set/add" + fileName + ".txt");
        long[] arrayForEstimatedTime = new long[size];

        for (int i = 0; i < size; i++) {
            startTime = System.nanoTime();
            set.add(t[i]);
            endTime = System.nanoTime();
            estimatedTime = endTime - startTime;
            arrayForEstimatedTime[i] = estimatedTime;
            writer.write(Long.toString(arrayForEstimatedTime[i]));
            writer.write(" ");
        }
        writer.close();
    }

    public void getPerfomance (Set<T> set, T[] t) throws IOException {
        String fileName = set.getClass().toString();
        FileWriter writer = new FileWriter("./second_task/set/get" + fileName + ".txt");
        long[] arrayForEstimatedTime = new long[size];

        for (int i = 0; i < size; i++) {
            startTime = System.nanoTime();
            set.contains(t[i]);
            endTime = System.nanoTime();
            estimatedTime = endTime - startTime;
            arrayForEstimatedTime[i] = estimatedTime;
            writer.write(Long.toString(arrayForEstimatedTime[i]));
            writer.write(" ");
        }
        writer.close();
    }

    public void removePerfomance (Set<T> set, T[] t) throws IOException {
        String fileName = set.getClass().toString();
        FileWriter writer = new FileWriter("./second_task/set/remove" + fileName + ".txt");
        long[] arrayForEstimatedTime = new long[size];

        for (int i = 0; i < size; i++) {
            startTime = System.nanoTime();
            set.remove(t[i]);
            endTime = System.nanoTime();
            estimatedTime = endTime - startTime;
            arrayForEstimatedTime[i] = estimatedTime;
            writer.write(Long.toString(arrayForEstimatedTime[i]));
            writer.write(" ");
        }
        writer.close();
    }
}
