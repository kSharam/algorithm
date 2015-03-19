package com.algorithms.hastable;

import com.algorithms.hastable.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // 1. Read file txt file return as ArrayList
        String path = "/home/sharmi/Desktop/code/algorithm/02/src/com/algorithms/wordlist.txt";
        FileReader readFile = new FileReader();
        ArrayList<String> strings = readFile.readFromFile(path);
        System.out.println("Total number of words from file : " + strings.size());
        //readFile.printMe(strings);

        //2. insert using hash implementation
        HashTable hashTable = new HashTable(strings.size());
        for (String each : strings) {
            hashTable.insert(each);
        }
        System.out.println("Total number of words in hashtable : " + hashTable.size());
        ArrayList<String> wordsWithoutDuplicate = hashTable.getKeys();

        //3. sort it
        wordsWithoutDuplicate.sort(new StringComparator());

        //4. print in order - no of occurences
        for (String each : wordsWithoutDuplicate) {
            System.out.println(each + " " + hashTable.get(each));
        }
        hashTable.compare.printCount();
        hashTable.assigns.printAssign();


    }
}