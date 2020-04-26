package UebungenKlausur2Semester.Datenstrukturen;

public class Sort {
    private static void swapElements(int[] array, int a, int b){
        int buffer = array[a];
        array[a] = array[b];
        array[b] = buffer;
    }

    public static int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swapElements(array, j, j + 1);
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array){
        int workingIndex = 0;
        for (int i = 0; i < array.length; i++) {
            workingIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    workingIndex = j;
                }
            }
            swapElements(array, i, workingIndex);
        }
        return array;
    }
}

