import java.util.ArrayList;
import java.util.List;

/**
 * Created by sharmi on 2/3/15.
 */
public class MergeSort implements Sorting{
    private ArrayList<Integer> input;
    Comparisons comparisons= new Comparisons();
    Exchanges exchanges= new Exchanges();


    public ArrayList<Integer> doSort(ArrayList<Integer> input) {
        this.input = input;
        if (input.isEmpty() || input.size() == 1) {
            return input;
        }
        doSort(0, input.size() - 1);
        return this.input;

    }

    private void doSort(int start, int end) {

        if (start == end) {
            return;
        } else {
            int midValue = (start + end) / 2;
            doSort(start, midValue);
            doSort((midValue + 1), end);
            doMerge(start, (midValue + 1), end);
        }
    }

    private void doMerge(int first, int second, int secondLast) {
        int lowBound = first;
        int firstEnd = (second - 1);
        int totalElements = secondLast - lowBound + 1;

        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        while (first <= firstEnd && second <= secondLast) {
            if (input.get(first) < input.get(second)) {
                tempArray.add(input.get(first));
                first++;
            } else {
                tempArray.add(input.get(second));
                second++;
            }
            comparisons.countCompare();
            exchanges.countExchange();
        }
        while (first <= firstEnd) {
            tempArray.add(input.get(first));
            first++;
            comparisons.countCompare();
            exchanges.countExchange();
        }
        while (second <= secondLast) {
            tempArray.add(input.get(second));
            second++;
            comparisons.countCompare();
            exchanges.countExchange();
        }
        for (int i = 0; i < totalElements; i++) {
            input.set(lowBound + i, tempArray.get(i));
        }

    }


}
