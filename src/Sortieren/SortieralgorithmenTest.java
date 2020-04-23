package Sortieren;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class SortieralgorithmenTest {

    static int count = 1000;
    static int randomRange = 3000000;
    static int[] toSort = null;

    @BeforeAll
    static void setup(){
        generateArray();
    }

    @Test
    void bubblesort() {
        int[] bubbleSortedArray = Sortieralgorithmen.bubblesort(toSort.clone());
        assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void bubblesortBergNeels() {
        int[] bubbleSortedArray = Sortieralgorithmen.bubblesortBergNeels(toSort.clone());
        assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void selectionSort() {
        int[] selectionsort = Sortieralgorithmen.selectionsort(toSort.clone());
        assertTrue(isSorted(selectionsort));
    }

    @Test
    void selectionSortBergNeels() {
        int[] selectionsort = Sortieralgorithmen.selectionsortBergNeels(toSort.clone());
        assertTrue(isSorted(selectionsort));
    }

    @Test
    void insertionSort() {
        int[] insertionSort = Sortieralgorithmen.insertionSort(toSort.clone());
        assertTrue(isSorted(insertionSort));
    }

    private static boolean isSorted(int[] array){
        for(int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }


    private static void generateArray(){
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
        }
    }
}