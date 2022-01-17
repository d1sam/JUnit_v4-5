import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void testBubbleSort() {
        int[] arr = {4, 12, -17, 3};
        int[] expected = {-17, 3, 4, 12};
        BubbleSort.bubbleSort(arr);
        Assert.assertArrayEquals(expected, arr);
    }

    @Test(expected = NullPointerException.class)
    public void testBubbleSortWithNullPointerException() {
        int[] arr = null;
        int[] expected = {-17, 3, 4, 12};
        BubbleSort.bubbleSort(arr);
        Assert.assertArrayEquals(expected, arr);
    }
}
