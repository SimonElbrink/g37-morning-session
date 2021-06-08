package se.lexicon.array.exercise;

import java.util.Arrays;

public class Exercise2 {

    //Data Storage | DataBase | List of numbers | Array Of Numbers
    private static int[] numbers = {43,346,237,2348,567,345};

    public static void main( String[] args )
    {
        int indexToFind = 43;

        int returnValue = indexOf(indexToFind);

        System.out.println("returnValue = " + returnValue);

    }

    private static int indexOf(int indexToFind) {
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, indexToFind);

        if(index >= 0) {
            System.out.println("Index Found!");
            System.out.println("Element: " + indexToFind +" was located at index: " + index);
            return index;
        }else {
            System.out.println("Could not find element: " + indexToFind);
            return -1;
        }
    }
}
