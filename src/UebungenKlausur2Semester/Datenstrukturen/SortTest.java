package UebungenKlausur2Semester.Datenstrukturen;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    static int count = 10000;
    static int randomRange = 3000000;
    static int[] toSort = null;
    Sort sort;

    @BeforeAll
    static void setup(){
        toSort = new int[count];
        for(int i = 0; i < count; i++){
            boolean notInserted = true;
            while(notInserted){
                int randomNumber = (int)(Math.random() * randomRange);

                boolean found = false;
                for(int j = 0; j < i; j++){
                    if(toSort[j] == randomNumber){
                        found = true;
                        break;
                    }
                }

                if(!found){
                    toSort[i] = randomNumber;
                    notInserted = false;
                }

            }
        };
    }

    @Test
    void bubbleSort() {
        int[] bubbleSortedArray = Sort.bubbleSort(toSort.clone());
        assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void selectionSort() {
        int[] selectionSortedArray = Sort.selectionSort(toSort.clone());
        assertTrue(isSorted(selectionSortedArray));
    }

    private static boolean isSorted(int[] array){
        for(int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
}