public class ArrayDemo {
    public static void main(
        String[] args
    ) {
        int[] anArray;

        anArray = new int[10];

        int numberAnArray = 100;

        for (
            int count = 0; 
            count <= 9; 
            count += 1
        ) {
            anArray[count] = numberAnArray;

            System.out.println(
                "Element at index " + count 
                + ": " + anArray[count]
            );

            numberAnArray += 100;
        }

        // other types arrays
        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;
    }
}
