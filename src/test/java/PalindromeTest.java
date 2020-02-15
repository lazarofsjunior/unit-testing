import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import school.cesar.until.Palindrome;

public class PalindromeTest {

    @Test
    public void check_emptyPalindrome_emptyPalindrome() {
        Assertions.assertEquals(true, Palindrome.check(""));
    }

    @Test
    public void check_noPalindrome_false() {
    Assertions.assertEquals(false, Palindrome.check("dado"));
    }

    @Test
    public void check_stringWithSameStartEnd_true() {
        Assertions.assertEquals(true, Palindrome.check("ovo"));
    }

    @Test
    public void check_stringLength1_true() {
        Assertions.assertEquals(true, Palindrome.check("a"));
    }

}