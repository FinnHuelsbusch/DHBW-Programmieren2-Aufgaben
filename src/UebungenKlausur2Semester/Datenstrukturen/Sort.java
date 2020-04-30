package UebungenKlausur2Semester.Datenstrukturen;

import javax.naming.ldap.LdapName;

public class Sort {
    private static void swapElements(int[] array, int a, int b) {
        int buffer = array[a];
        array[a] = array[b];
        array[b] = buffer;
    }

    public static int[] bubbleSort(int[] array) {
        for ( int i = array.length - 1; i > 0; i-- ) {
            for ( int j = 0; j < i; j++ ) {
                if (array[j] > array[j + 1]) {
                    swapElements(array, j, j + 1);
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        for ( int i = 0; i < array.length; i++ ) {
            int workingIndex = i;
            for ( int j = i; j < array.length; j++ ) {
                if (array[workingIndex] > array[j]) {
                    workingIndex = j;
                }
            }
            swapElements(array, i, workingIndex);
        }
        return array;
    }

    public static int[] quickSort(int[] array) {
        quickSort(array, 0, array.length-1);
        return array;
    }

    private static void quickSort(int[] array,int start, int end) {
        if (start < end) {
            int pivot = divide(array, start, end);
            quickSort(array, start, pivot-1);
            quickSort(array, pivot+1, end);
        }

    }

    private static int divide(int[] array, int start, int end) {
        int pivot = array[end], i = start, j = end-1;
        while (i < j) {
            while (array[i] < pivot&& i < end ) i++;
            while (j > start && array[j] >= pivot) j--;
            if (i < j) {
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;
            }
        }
        if (array[i] > pivot) {
            int swap = array[i];
            array[i] = array[end];
            array[end] = swap;
        }
        return i;
    }
}