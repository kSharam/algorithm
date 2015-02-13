import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by sharmi on 2/4/15.
 */
public class BubbleSort implements Sorting {
    int count=0;
    int Array[];
    private ArrayList<Integer> output= new ArrayList<Integer>();
    Comparisons comparisons= new Comparisons();
    Exchanges exchanges= new Exchanges();


    public ArrayList<Integer> doSort(ArrayList<Integer> input)
    {
        Array= new int[input.size()];
        Iterator<Integer> iterate = input.iterator();
        for (int x=0;iterate.hasNext();x++) {
            Array[x] = iterate.next();
        }
        for(int back=Array.length-1; back>=1; back--) {
            for (int front = 0; front < back; front++) {
                comparisons.countCompare();
                if (Array[front] > Array[front + 1]) {
                    swap(front, front + 1);
                }
            }
        }
        System.out.println("Comparison Count:"+ comparisons.printCount());
        System.out.println("Exchange Count:" +exchanges.printExchange());
        for (int i = 0; i < Array.length; i++)
            output.add(Integer.valueOf(Array[i]));
        return output;

    }


    public void swap(int a, int b)
    {
        int temp;
        temp= Array[a];
        Array[a]= Array[b];
        Array[b]= temp;
        exchanges.countExchange();

    }
}
