package com.java.mongo.org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDemo {

    //private String regex = "^[a-zA-Z0-9. ]*$";

    private String regex = "[^\\s*]+^([a-zA-Z0-9 ]+[a-zA-Z0-9.])*$";

    //private final static String regex = "[^\\w]";

    @Test
    public void test_only_symbols_01() {
        String testString = "$$$$";
        Assertions.assertFalse(patternFinder(testString));
        Assertions.assertFalse(patternMatcher(testString));
    }

    @Test
    public void test_only_symbols_02() {
        String testString = "@@@@";
        Assertions.assertFalse(patternFinder(testString));
        Assertions.assertFalse(patternMatcher(testString));
    }

    @Test
    public void test_num_symbols_space() {
        String testString = "123 2#3213 12$3 123....";
        Assertions.assertFalse(patternFinder(testString));
        Assertions.assertFalse(patternMatcher(testString));
    }

    @Test
    public void test_num_space() {
        String testString = "123 233213 123 123.....";
        Assertions.assertFalse(patternFinder(testString));
        Assertions.assertFalse(patternMatcher(testString));
    }

    @Test
    public void test_num_letter_space() {
        String testString = "WWWW qwqwq 123 123.";
        Assertions.assertTrue(patternFinder(testString));
        Assertions.assertTrue(patternMatcher(testString));
    }

    @Test
    public void test_num_letter_mutil_space_space() {
        String testString = "WWWW   qwqwq 123   123.";
        Assertions.assertTrue(patternFinder(testString));
        Assertions.assertTrue(patternMatcher(testString));
    }

    @Test
    public void test_start_with_space() {
        String testString = " WWWW qwqwq 123 123.";
        Assertions.assertFalse(patternFinder(testString));
        Assertions.assertFalse(patternMatcher(testString));
    }


    @Test
    public void test_only_symbol_juhao() {
        String testString = "......";
        Assertions.assertFalse(patternFinder(testString));
        Assertions.assertFalse(patternMatcher(testString));
    }

    @Test
    public void test_only_space() {
        String testString = "             ";
        Assertions.assertFalse(patternFinder(testString));
        Assertions.assertFalse(patternMatcher(testString));
    }


    private boolean patternFinder(String testString) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(testString);
        return m.find();
    }


    private boolean patternMatcher(String testString) {
        return Pattern.matches(regex, testString);
    }
}
