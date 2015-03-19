import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortTesting {
    private final Sorting sort = new MergeSort();
    @Test
    public void testDoSortEmptyArray() throws Exception {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList<Integer> actual = sort.doSort(new ArrayList<Integer>());
        assertArrayEquals("Bug in empty array",expected.toArray(),actual.toArray());
    }

    @Test
    public void testDoSortOne() throws Exception {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(10);
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(10);

        ArrayList<Integer> actual = sort.doSort(input);
        assertArrayEquals("Bug in empty array",expected.toArray(),actual.toArray());
    }

    @Test
    public void testDoSortTwoA() throws Exception {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(10);
        ArrayList<Integer> input = new ArrayList<Integer>(){{
            add(5);
            add(10);
        }};

        ArrayList<Integer> actual = sort.doSort(input);
        assertArrayEquals("Bug in empty array",expected.toArray(),actual.toArray());
    }

    @Test
    public void testDoSortTwoD() throws Exception {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(10);
        ArrayList<Integer> input = new ArrayList<Integer>(){{
            add(10);
            add(5);
        }};

        ArrayList<Integer> actual = sort.doSort(input);
        assertArrayEquals("Bug in empty array",expected.toArray(),actual.toArray());
    }

    @Test
    public void testDoSortThreeD() throws Exception {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(5);
        expected.add(10);
        ArrayList<Integer> input = new ArrayList<Integer>(){{
            add(10);
            add(5);
            add(1);
        }};

        ArrayList<Integer> actual = sort.doSort(input);
        assertArrayEquals("Bug in empty array",expected.toArray(),actual.toArray());
    }
    @Test
    public void testDoSortThreeS() throws Exception {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(7);
        expected.add(10);
        expected.add(15);
        ArrayList<Integer> input = new ArrayList<Integer>(){{
            add(7);
            add(15);
            add(10);
        }};

        ArrayList<Integer> actual = sort.doSort(input);
        assertArrayEquals("Bug in empty array",expected.toArray(),actual.toArray());
    }

    @Test
    public void testDoSortThreeA() throws Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(){{
            add(1);
            add(5);
            add(7);
        }};
        ArrayList<Integer> expected = new ArrayList<Integer>(){{
            add(1);
            add(5);
            add(7);
        }};

        ArrayList<Integer> actual = sort.doSort(input);
        assertArrayEquals("Bug in empty array",expected.toArray(),actual.toArray());
    }

    @Test
    public void testDoSortFourA() throws Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(){{
            add(1);
            add(5);
            add(7);
            add(10);
        }};
        ArrayList<Integer> expected = new ArrayList<Integer>(){{
            add(1);
            add(5);
            add(7);
            add(10);
        }};

        ArrayList<Integer> actual = sort.doSort(input);
        assertArrayEquals("Bug in empty array",expected.toArray(),actual.toArray());
    }

    @Test
    public void testDoSortFourS() throws Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(){{
            add(10);
            add(50);
            add(700);
            add(1);
        }};
        ArrayList<Integer> expected = new ArrayList<Integer>(){{
            add(1);
            add(10);
            add(50);
            add(700);
        }};

        ArrayList<Integer> actual = sort.doSort(input);
        assertArrayEquals("Bug in empty array",expected.toArray(),actual.toArray());
    }

    @Test
    public void testTemp() throws Exception {
        ArrayList<Integer> input = new ArrayList<Integer>(){{
            add(7);
            add(15);
            add(10);
            add(50);
        }};
        ArrayList<Integer> expected = new ArrayList<Integer>(){{
            add(7);
            add(10);
            add(15);
            add(50);
        }};

        ArrayList<Integer> actual = sort.doSort(input);
        assertArrayEquals("Bug in empty array",expected.toArray(),actual.toArray());
    }

}