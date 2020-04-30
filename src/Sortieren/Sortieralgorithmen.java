package Sortieren;

public class Sortieralgorithmen {



    private static void print(int[] list) {
        for (int i1 : list) {
            System.out.print(i1 + ", ");
        }
    }

    public static int[] selectionsort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    swap(list, i, j);
                }
            }
        }
        return list;
    }

    public static int[] bubblesort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length -1; j++) {
                if (list[j] > list[j + 1]) {
                    swapPoswithNext(list, j);
                }
            }
        }
        return list;
    }


    public static int[] bubblesortBergNeels(int[] list) {
        int j = list.length-1;
        boolean swapped = false;
        do{
            swapped = false;
        for (int i = 0; i < j; i++) {
            if(list[i]>list[i+1]){
                swapPoswithNext(list, i);
                swapped = true; 
            }
        }
        j--; 
        }while(swapped == true);
        return list;
    }

    private static void swapPoswithNext(int[] list, int pos) {
        swap(list, pos+1, pos);
    }

    public static int[] insertsort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int element = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > element) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = element;
        }
        return list;
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


    public static int[] selectionsortBergNeels(int[] list) {
        int marker = list.length - 1;
        while (marker > 0) {
            int maxPosition = 0;
            for (int i = 0; i <= marker; i++) {
                if (list[i] > list[maxPosition]) {
                    maxPosition = i;
                }
            }
            swap(list, marker, maxPosition);
            marker--;
        }
        return list;
    }

    public static int[] quickSortBergNeels(int[] array) {
        quickSortBergNeels(array, 0, array.length - 1);
        return array;
    }


    private static int[] quickSortBergNeels(int[] array, int left, int right) {
        int indexLeft = left, indexRight = right;

        if (indexLeft <= indexRight) {
            int pivot = array[(indexLeft + indexRight) / 2];
            while (indexLeft < indexRight) {
                while (array[indexLeft] < pivot) indexLeft++;
                while (array[indexRight] > pivot) indexRight--;
                if (indexLeft <= indexRight) {
                    swap(array, indexLeft, indexRight);
                    indexLeft++;
                    indexRight--;
                }
            }
            if(left<indexRight) quickSortBergNeels(array, left, indexRight);
            if(right>indexLeft) quickSortBergNeels(array, indexLeft, right);
        }

        return array;
    }

    private static void swap(int[] list, int pos1, int pos2) {
        int swap = list[pos2];
        list[pos2] = list[pos1];
        list[pos1] = swap;
    }

    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j >0; j--) {
                if (list[j] < list[j - 1]) {
                    swapPoswithNext(list, j-1);
                } else {
                    break;
                }

            }
        }
        return list;
    }
}
