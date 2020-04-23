public class Sortieralgorithmen {

    private Sortieralgorithmen() {
        int[] list = new int[]{64, 55, 98, 32, 12, 4, 56, 95, 87, 32, 56, 45, 73, 19, 37, 49, 11, 12, 1, 27, 13, 15, 45, 45, 98, 65, 75, 32, 15, 246, 21, 54, 85, 81, 91};
        print(selectionsort(list));
        System.out.println();
        print(bubblesort((list)));
        System.out.println();
        print(insertsort((list)));
        System.out.println();
        print(quicksort(list));
        System.out.println();
        print(bubblesortBergNeels(list)); 
    }

    public static void main(String[] args) {
        new Sortieralgorithmen();
    }

    private void print(int[] list) {
        for (int i1 : list) {
            System.out.print(i1 + ", ");
        }
    }

    private int[] selectionsort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
        return list;
    }

    private int[] bubblesort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length -1; j++) {
                if (list[j] > list[j + 1]) {
                    swap(list, j);
                }
            }
        }
        return list;
    }


    private int[] bubblesortBergNeels(int[] list) {
        int j = list.length-1; 
        do{
        boolean swapped = false; 
        for (int i = 0; i < j; i++) {
            if(list[i]>list[i+1]){
                swap(list, i); 
                swapped = true; 
            }
        }
        j--; 
        }while(swapped == true); 
    }

    private void swap(int[] list, int i) {
        int swap = list[i]; 
        list[i] = list[i+1]; 
        list[i+1] = swap;
    }

    private int[] insertsort(int[] list) {
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


    private int partition(int[] list, int min, int max) {
        int pivot = list[max];
        int j = min - 1;
        for (int i = min; i < max; i++) {
            if (list[i] <= pivot) {
                j++;
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        int temp = list[max];
        list[max] = list[j + 1];
        list[j + 1] = temp;
        return j;
    }


    private int[] quicksort(int[] list, int min, int max) {
        if (min < max) {
            int pi = partition(list, min, max);
            quicksort(list, min, pi - 1);
            quicksort(list, pi + 1, max);
        }
        return list;
    }

    private int[] quicksort(int[] list) {
        return quicksort(list, 0, list.length - 1);
    }

}
