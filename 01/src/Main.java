//import com.sun.java.util.jar.pack.ConstantPool;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by sharmi on 2/3/15.
 */
public class Main {


    public static void main(String[] args) throws FileNotFoundException{

        // 1. Read file txt file return as ArrayList
        String path = "/home/sharmi/Documents/Denver/Book/Algorithms/Problem set1/shuffled.txt";
        FileReader readFile = new FileReader();
        ArrayList<Integer> integers = readFile.readFromFile(path);

        // 2.  Sort it
        MergeSort mergeSort = new MergeSort();
        ArrayList<Integer> afterMerge = mergeSort.doSort(integers);
//        BubbleSort bubbleSort = new BubbleSort();
//        ArrayList<Integer> afterBubbling = bubbleSort.doSort(integers);

        // 3. Write to file or Display.
        PrintArrayList printArrayList = new PrintArrayList();
        printArrayList.printMe(afterMerge);
//        printArrayList.printMe(afterBubbling);
    }
}