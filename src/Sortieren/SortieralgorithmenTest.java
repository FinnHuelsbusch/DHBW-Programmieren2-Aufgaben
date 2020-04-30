package Sortieren;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class SortieralgorithmenTest {

    static int count = 100000;
    static int randomRange = 3000000;
    static int[] toSort = null;

    @BeforeAll
    static void setup(){
        generateArray();
    }

    @Test
    void bubblesort() {
        System.out.println("Mein BubbleSort");
        long start = System.currentTimeMillis();
        int[] bubbleSortedArray = Sortieralgorithmen.bubblesort(toSort.clone());
        assertTrue(isSorted(bubbleSortedArray));
        System.out.println(System.currentTimeMillis()-start);
    }

    @Test
    void bubblesortBergNeels() {
        System.out.println("Berg Neels BubbleSort");
        long start = System.currentTimeMillis();
        int[] bubbleSortedArray = Sortieralgorithmen.bubblesortBergNeels(toSort.clone());
        assertTrue(isSorted(bubbleSortedArray));
        System.out.println(System.currentTimeMillis()-start);
    }

    @Test
    void selectionSort() {
        System.out.println("Mein selectionSort");
        long start = System.currentTimeMillis();
        int[] selectionsort = Sortieralgorithmen.selectionsort(toSort.clone());
        assertTrue(isSorted(selectionsort));
        System.out.println(System.currentTimeMillis()-start);
    }

    @Test
    void selectionSortBergNeels() {
        System.out.println("Berg Neeld selectionSort");
        long start = System.currentTimeMillis();
        int[] selectionsort = Sortieralgorithmen.selectionsortBergNeels(toSort.clone());
        assertTrue(isSorted(selectionsort));
        System.out.println(System.currentTimeMillis()-start);
    }

    @Test
    void insertionSortBergNeels() {
        System.out.println("Berg Neels insertionSort");
        long start = System.currentTimeMillis();
        int[] insertionSort = Sortieralgorithmen.insertionSort(toSort.clone());
        assertTrue(isSorted(insertionSort));
        System.out.println(System.currentTimeMillis()-start);
    }

    @Test
    void insertionSort() {
        System.out.println("Mein insertionSort");
        long start = System.currentTimeMillis();
        int[] insertionSort = Sortieralgorithmen.insertsort(toSort.clone());
        assertTrue(isSorted(insertionSort));
        System.out.println(System.currentTimeMillis()-start);
    }

    @Test
    void quickSort() {
        System.out.println("Mein quickSort");
        long start = System.currentTimeMillis();
        int[] insertionSort = Sortieralgorithmen.quickSort(toSort.clone());
        assertTrue(isSorted(insertionSort));
        System.out.println(System.currentTimeMillis()-start);
    }

    @Test
    void quickSortBergNeels() {
        System.out.println("Berg Neels quickSort");
        long start = System.currentTimeMillis();
        int[] insertionSort = Sortieralgorithmen.quickSortBergNeels(toSort.clone());
        assertTrue(isSorted(insertionSort));
        System.out.println(System.currentTimeMillis()-start);
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