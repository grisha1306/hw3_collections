package com.company.speedtest.perfomance;

import com.company.list.ILinkedList;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PerfomanceListCollection<T> {

    private long startTime;
    private long endTime;
    private long estimatedTime;
    private int size;

    public PerfomanceListCollection(int size) {
        this.size = size;
    }

    public void addPerfomance (List<T> list, T[] t) throws IOException {
        String fileName = list.getClass().toString();
        FileWriter writer1 = new FileWriter("./second_task/list/add" + fileName + ".txt");
        FileWriter writer2 = new FileWriter("./first_task/add" + fileName + ".txt");
        long[] arrayForEstimatedTime = new long[size];

        int halfOFSize = (int) size / 2;
        for (int i = 0; i < size; i++) {
            startTime = System.nanoTime();
            list.add(t[i]);
            endTime = System.nanoTime();
            estimatedTime = endTime - startTime;
            arrayForEstimatedTime[i] = estimatedTime;
            writer1.write(Long.toString(arrayForEstimatedTime[i]));
            writer1.write(" ");
            writer2.write(Long.toString(arrayForEstimatedTime[i]));
            writer2.write(" ");
        }

//        for (int i = halfOFSize; i < size ; i++) {
//            startTime = System.nanoTime();
//            list.add(halfOFSize, t[i]);
//            estimatedTime = System.nanoTime() - startTime;
//            arrayForEstimatedTime[i] = estimatedTime;
//            writer1.write(Long.toString(arrayForEstimatedTime[i]));
//            writer1.write(" ");
//            writer2.write(Long.toString(arrayForEstimatedTime[i]));
//            writer2.write(" ");
//        }
        writer1.close();
        writer2.close();
    }

    public void getPerfomance (List<T> list) throws IOException {
        String fileName = list.getClass().toString();
        FileWriter writer1 = new FileWriter("./second_task/list/get" + fileName + ".txt");
        FileWriter writer2 = new FileWriter("./first_task/get" + fileName + ".txt");
        long[] arrayForEstimatedTime = new long[size];

        for (int i = 0; i < size; i++) {
            startTime = System.nanoTime();
            list.get(i);
            endTime = System.nanoTime();
            estimatedTime = endTime - startTime;
            arrayForEstimatedTime[i] = estimatedTime;
            writer1.write(Long.toString(arrayForEstimatedTime[i]));
            writer1.write(" ");
            writer2.write(Long.toString(arrayForEstimatedTime[i]));
            writer2.write(" ");
        }
        writer1.close();
        writer2.close();
    }

    public void removePerfomance (List<T> list) throws IOException {
        String fileName = list.getClass().toString();
        FileWriter writer1 = new FileWriter("./second_task/list/remove" + fileName + ".txt");
        FileWriter writer2 = new FileWriter("./first_task/remove" + fileName + ".txt");
        long[] arrayForEstimatedTime = new long[size];

        for (int i = 0; i < size; i++) {
            startTime = System.nanoTime();
            list.remove((int)list.size()/2);
            endTime = System.nanoTime();
            estimatedTime = endTime - startTime;
            arrayForEstimatedTime[i] = estimatedTime;
            writer1.write(Long.toString(arrayForEstimatedTime[i]));
            writer1.write(" ");
            writer2.write(Long.toString(arrayForEstimatedTime[i]));
            writer2.write(" ");
        }
        writer1.close();
        writer2.close();
    }
}