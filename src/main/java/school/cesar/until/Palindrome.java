package school.cesar.until;

public class Palindrome {

    public static boolean check(String word) {

        int length = word.length();


        if (length <= 1) {
            return true;
        }

        if (word.charAt(0) == word.charAt(length - 1)) {

            return check(word.substring(1, length - 1));
        }

        return false;
    }
}
