public class Palindrome {
    public Boolean palidnrome(String text) {
        for(int i = 0; i < text.length() / 2; i++) {
            if(text.charAt(i) != text.charAt(text.length() - 1 - i)){
                System.out.println(text + " is not a polindrome");
                return  false;
            }
        }
        System.out.println(text + " is a polindrome");
        return true;
    }

    private Boolean assertEquals(String text, Boolean expected) {
        return palidnrome(text) == expected;
    }

    public void testPalindrome() {
        if(!assertEquals("luka", false)) {
            System.err.println("Test failed: luka is not palindrome");
            return;
        }


        if(!assertEquals("lukaakul", true)) {
            System.err.println("Test failed: lukaakul is palindrome ");
            return;
        }


        System.out.println("All testes passed");
    }
}
