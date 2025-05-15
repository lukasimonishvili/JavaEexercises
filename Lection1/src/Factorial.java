public class Factorial {
    public int factorial(int number) {
        if(number == 1){
            return 1;
        }else {
            return factorial(number-1) * number;
        }
    }

    private Boolean assertEquals (int number, int expected) {
        return expected == factorial(number);
    }
    public void testFactorial() {
        if(!assertEquals(5, 120)) {
            System.err.println("Test failed: factorial of 5 should be 120");
            return;
        }

        if(!assertEquals(6, 720)) {
            System.err.println("Test failed: factorial of 6 should be 720");
            return;
        }

        if(!assertEquals(7, 5040)) {
            System.err.println("Test failed: factorial of 7 should be 5040");
            return;
        }

        if(!assertEquals(8, 40320)) {
            System.err.println("Test failed: factorial of 8 should be 40320");
            return;
        }

        System.out.println("All testes passed");
    }
}
