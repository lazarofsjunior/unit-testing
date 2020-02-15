import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import school.cesar.until.Sorting;

public class SortingTest {

    @Test
    public void bublesort_emptyArray_emptyArray() {

        int[] emptyArray = {};
        int[] array = {};
        Sorting.bubbleSort(emptyArray);
        Assertions.assertArrayEquals(emptyArray, array);
    }

    @Test
    public void bublesort_singleElementArray_noArrayChanges() {

        int[] emptyArray = {1};
        int[] array = {1};
        Sorting.bubbleSort(array);
        Assertions.assertArrayEquals(emptyArray, array);
    }

    @Test
    public void bublesort_sortdArray_noArrayChanges() {

        int[] emptyArray = {1, 2};
        int[] array = {1, 2};
        Sorting.bubbleSort(array);
        Assertions.assertArrayEquals(emptyArray, array);
    }

    @Test
    public void bublesort_sordArray_noArrayChanges() {

        int[] emptyArray = {1, 2};
        int[] array = {2, 1};
        Sorting.bubbleSort(array);
        Assertions.assertArrayEquals(emptyArray, array);
    }

    @Test
    public void bublesort_sorArray_noArrayChanges() {

        int[] expect = {1, 3, 5, 10, 12, 24};
        int[] array = {10, 5, 3, 1, 24, 12};
        Sorting.bubbleSort(array);
        Assertions.assertArrayEquals(expect, array);
    }

}
