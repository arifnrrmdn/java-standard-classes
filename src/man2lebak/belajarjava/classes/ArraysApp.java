package man2lebak.belajarjava.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {90, 122, 34, 41, 72, 13, 54, 25, 96, 37, 8};

        // mengurutkan angka
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // binary search
        System.out.println(Arrays.binarySearch(numbers,90));
        System.out.println(Arrays.binarySearch(numbers,122));
        System.out.println(Arrays.binarySearch(numbers, 0));

        // copy
        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        // copy range
        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
}
