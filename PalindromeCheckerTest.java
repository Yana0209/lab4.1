package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void isPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("level"));
        assertTrue(PalindromeChecker.isPalindrome("radar"));
        assertTrue(PalindromeChecker.isPalindrome("Able was I ere I saw Elba"));
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
    }
    @Test
    public void nonPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
        assertFalse(PalindromeChecker.isPalindrome("This is not a palindrome"));
    }

    @Test
    public void EmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }
}