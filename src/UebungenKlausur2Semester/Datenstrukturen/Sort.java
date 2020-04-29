package UebungenKlausur2Semester.Datenstrukturen;

public class Sort {
    private static void swapElements(int[] array, int a, int b){
        int buffer = array[a];
        array[a] = array[b];
        array[b] = buffer;
    }

    public static int[] bubbleSort(int[] array){
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swapElements(array, j, j + 1);
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int workingIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[workingIndex] > array[j]) {
                    workingIndex = j;
                }
            }
            swapElements(array, i, workingIndex);
        }
        return array;
    }

    public static class Exceptions {

        public static void main(String[] args) {
            new Exceptions();
        }

        public Exceptions() {
            System.out.println( div(5, 2));
            String a = "Hallo";
            System.out.println(a instanceof String);
            System.out.println(new Integer(5).compareTo(5));
        }

        public int div(int a, int b) throws NullPointerException{

            return a / b;
        }

    }
}

