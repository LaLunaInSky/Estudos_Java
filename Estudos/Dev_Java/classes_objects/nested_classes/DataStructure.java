package nested_classes;

import java.util.Iterator;

public class DataStructure {

    private static final int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        DataStructureIterator iterator = this.new EvenIterator();

        while (iterator.hasNext()) {
            IO.print(iterator.next() + " ");
        }

        IO.println();
    }

    interface DataStructureIterator extends Iterator<Integer> {}

    private class EvenIterator implements DataStructureIterator {

        private int nextIndex = 0;

        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            nextIndex += 2;

            return retValue;
        }
    }
}
