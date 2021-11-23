package com.company.perfomance;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class PerfomanceMapsCollection<K,V> {
    private long startTime;
    private long endTime;
    private long estimatedTime;
    private int size;
    private Integer[] arrayOfKeys = new Integer[size];

    public PerfomanceMapsCollection(int size) {
        this.size = size;
//        creationOfIntegers();
    }

//    private void creationOfIntegers() {
//        for (int k = 0; k < size; k++) {
//            arrayOfKeys[k] = new Integer(k);
//        }
//    }

    public void addPerfomance (Map<Integer,V> map, V[] v, Integer[] arrayOfKeys)  {
        String fileName = map.getClass().toString();
        try {
        FileWriter writer = new FileWriter("./second_task/map/add" + fileName + ".txt");
        long[] arrayForEstimatedTime = new long[size];

        int halfOFSize = (int) size / 2;
        for (int i = 0; i < size; i++) {
            startTime = System.nanoTime();
            map.put(arrayOfKeys[i], v[i] );
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

    public void getPerfomance (Map<Integer,V> map, Integer[] arrayOfKeys) {
        String fileName = map.getClass().toString();
        try {
        FileWriter writer = new FileWriter("./second_task/map/get" + fileName + ".txt");
        long[] arrayForEstimatedTime = new long[size];

        for (int i = 0; i < size; i++) {
            startTime = System.nanoTime();
            map.get(arrayOfKeys[i]);
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

    public void removePerfomance (Map<Integer,V> map, Integer[] arrayOfKeys) {
        String fileName = map.getClass().toString();
        try {
        FileWriter writer = new FileWriter("./second_task/map/remove" + fileName + ".txt");
        long[] arrayForEstimatedTime = new long[size];

        for (int i = 0; i < size; i++) {
            startTime = System.nanoTime();
            map.remove(arrayOfKeys[i]);
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
