import java.util.Arrays;

public class InvertArray {
    public String invertArray(int[] array) {
        System.out.println("before " + Arrays.toString(array));
        int temp;
        for(int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("After " + Arrays.toString(array));
        return Arrays.toString(array);
    }

    private Boolean assertEquals(int[] input, String expected) {
        return expected.equals(invertArray(input));
    }

    public void testInvertArray() {
        if(!assertEquals(new int[]{1,2,3,4,5}, "[5, 4, 3, 2, 1]")) {
            System.err.println("Test failed. array inversion error");
            return;
        }

        if(!assertEquals(new int[]{1,2,3,4,5,6}, "[6, 5, 4, 3, 2, 1]")) {
            System.err.println("Test failed. array inversion error");
            return;
        }

        if(!assertEquals(new int[]{1,2,3,4,5,19}, "[19, 5, 4, 3, 2, 1]")) {
            System.err.println("Test failed. array inversion error");
            return;
        }

        System.out.println("All tests passed");
    }
}
