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
        long start = System.currentTimeMillis();
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
        System.out.println(System.currentTimeMillis()-start);
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


    private static int partition(int[] list, int min, int max) {
        int pivot = list[max];
        int j = min - 1;
        for (int i = min; i < max; i++) {
            if (list[i] <= pivot) {
                j++;
                swap(list, j, i);
            }
        }
        swap(list, j + 1, max);
        return j;
    }


    private static int[] quicksort(int[] list, int min, int max) {
        if (min < max) {
            int pi = partition(list, min, max);
            quicksort(list, min, pi - 1);
            quicksort(list, pi + 1, max);
        }
        return list;
    }

    public static int[] quicksort(int[] list) {
        long start = System.currentTimeMillis();
        int[] sortedlist  = quicksort(list, 0, list.length - 1);
        System.out.println(System.currentTimeMillis()-start);
        return sortedlist;
    }


    public static int[] selectionsortBergNeels(int[] list) {
       long start = System.currentTimeMillis();

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
        System.out.println(System.currentTimeMillis()-start);
        return list;
    }

    private static void swap(int[] list, int pos1, int pos2) {
        int swap = list[pos2];
        list[pos2] = list[pos1];
        list[pos1] = swap;
    }

    public static int[] insertionSort(int[] list) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j >0; j--) {
                if (list[j] < list[j - 1]) {
                    swapPoswithNext(list, j-1);
                } else {
                    break;
                }

            }
        }
        System.out.println(System.currentTimeMillis()-start);
        return list;
    }
}
