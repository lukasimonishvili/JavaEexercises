public class GreatestMember {
    public int greatestMember(int[] array) {
        int result = array[0];
        int position = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > result) {
                result = array[i];
                position = i;
            }
        }

        System.out.println("biggest number " + result + " detected at index " + position);
        return result;
    }

    private Boolean assertEquals(int[] input, int expected) {
        return  greatestMember(input) == expected;
    }

    public void testGreatestMember() {
        if(!assertEquals(new int[]{1, 7, 22, 8, 9, 12, 23, 66, 109, 12, 0}, 109)) {
            System.err.println("Test failed: greatest number didn`t found correctly");
            return;
        }

        if(!assertEquals(new int[]{1, 7, 22, 8, 9, 12, 23, 66, 12, 0}, 66)) {
            System.err.println("Test failed: greatest number didn`t found correctly");
            return;
        }

        if(!assertEquals(new int[]{1, 7, 22, 8, 9, 12, 23, 12, 0}, 23)) {
            System.err.println("Test failed: greatest number didn`t found correctly");
            return;
        }

        System.out.println("all tests passed");
    }
}
