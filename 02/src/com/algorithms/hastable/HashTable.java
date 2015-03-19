package com.algorithms.hastable;

import java.util.ArrayList;

/**
 * Created by sharmi on 3/15/15.
 */
public class HashTable {

    private Data[] hashTable;
     public comparisons compare = new comparisons();
    public assignments assigns= new assignments();

    public HashTable(int intialSize) {
        hashTable = new Data[intialSize * 2];
    }

    public void insert(String input) {

        int index = hash(input);
        int stepsize = hash0(input);

        compare.countCompare();
        if (hashTable[index] == null) {
            hashTable[index] = new Data(input, 1);
            assigns.countAssign();
        }
        else if (hashTable[index].getKey().equals(input)) {
            compare.countCompare();
            int count = hashTable[index].getCount();
            hashTable[index] = new Data(input, count + 1);
            assigns.countAssign();
        }
        else {
            do {
                compare.countCompare();
                index += stepsize;
                index = index % hashTable.length;

            } while (hashTable[index] != null ||
                    (hashTable[index] != null && input.equals(hashTable[index].getKey())));
            int count = hashTable[index] == null ? 0 : hashTable[index].getCount();
            hashTable[index] = new Data(input, count + 1);
            assigns.countAssign();
        }

    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            Data data = hashTable[i];
            if (data != null) {
                System.out.println(data.getKey() + "  " + data.getCount());
            }

        }

    }

    public int get(String key) {

        int index = hash(key);
        int stepsize = hash0(key);

        compare.countCompare();
        compare.countCompare();
        if (hashTable[index] == null) {
            return 0;
        }
        else if (hashTable[index].getKey().equals(key)) {
            return hashTable[index].getCount();
        }
        else {
            do {
                compare.countCompare();
                index += stepsize;
                index = index % hashTable.length;
                if (hashTable[index] == null) {
                    return 0;
                }
            } while (!key.equals(hashTable[index].getKey()));

            return hashTable[index].getCount();
        }

    }

    public int size() {
        int sum = 0;
        for (int i = 0; i < hashTable.length; i++) {
            Data data = hashTable[i];
            if (data != null) {
                sum = sum + data.getCount();
            }

        }
        return sum;
    }

    // Hash function implementation
    private int hash(String data) {
        // Reference : http://courses.cs.vt.edu/~cs3114/Fall10/Notes/T16.HashFunctions.pdf
        int value = 0;
        for (int position = 0; position < data.length(); position++) {
            value = (value << 4) + data.charAt(position);
            int bitValue = value & 0xF0000000;
            if (bitValue != 0)
                value ^= bitValue >> 24;
            value &= ~bitValue;

        }
        return value % hashTable.length;
    }


    private int hash0(String data) {
        //Reference: Data structures and algorithms second edition: Robert Lafore.
        return 2 - hash(data) % 2;
    }

    public ArrayList<String> getKeys() {
        ArrayList<String> keys = new ArrayList<String>();
        for(Data each :hashTable) {
            if(each != null) {
                keys.add(each.getKey());
            }
        }
        return keys;
    }


}
