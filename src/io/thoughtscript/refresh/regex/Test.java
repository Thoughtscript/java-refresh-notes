package io.thoughtscript.refresh.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Test {

    private static final String LINE_BREAK = System.getProperty("line.separator");

    private static Boolean regexMatch(String testCase, String input) {
        boolean matches = Pattern.matches(testCase, input);

        Pattern test = Pattern.compile(testCase);
        Matcher m = test.matcher(input);
        boolean matcher = m.find();
        return matches || matcher;
    }

    public static void runStringTest(String testCase, String input, Boolean expected) {

        System.out.println("Test case: " + testCase);
        System.out.println("Test: " + input);
        System.out.println("Expected: " + expected);

        Boolean test = regexMatch(testCase, input);
        String pass = (test.equals(expected)) ? "pass" : "fail";

        System.out.println("Pass: " + pass);
        System.out.println(LINE_BREAK);
    }


}
