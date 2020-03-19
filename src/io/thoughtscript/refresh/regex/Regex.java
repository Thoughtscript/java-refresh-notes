package io.thoughtscript.refresh.regex;

import java.util.regex.Pattern;

public class Regex {

    public static void runExamples() {

        Test.runStringTest(Constants.SPECIAL_CHAR, "a", false);
        Test.runStringTest(Constants.SPECIAL_CHAR,  "d#525%#", true);
        Test.runStringTest(Constants.SPECIAL_CHAR,  "aeg253", false);
        Test.runStringTest(Constants.SPECIAL_CHAR,  "%#$#", true);
        Test.runStringTest(Constants.SPECIAL_CHAR, "#!", true);

        Test.runStringTest(Constants.WEAK_HTML, "<tag>", false);
        Test.runStringTest(Constants.WEAK_HTML, "<tag><tag>", false);
        Test.runStringTest(Constants.WEAK_HTML, "<a href=''>text</a>", false);
        Test.runStringTest(Constants.WEAK_HTML, "<span>text</span>", true);
        Test.runStringTest(Constants.WEAK_HTML, "<span>text</span>", true);
        Test.runStringTest(Constants.WEAK_HTML, "<h1></h1>", true);

        Test.runStringTest(Constants.STRONG_HTML, "<tag>", false);
        Test.runStringTest(Constants.STRONG_HTML, "<tag><tag>", false);
        Test.runStringTest(Constants.STRONG_HTML, "<a href=''>text</a>", true);
        Test.runStringTest(Constants.STRONG_HTML, "<span>text</span>", true);
        Test.runStringTest(Constants.STRONG_HTML, "<h1></h1>", false);

        Test.runStringTest(Constants.WEAK_EMAIL, "as@.324.53253.c", true);
        Test.runStringTest(Constants.WEAK_EMAIL, "a@b.c", true);
        Test.runStringTest(Constants.WEAK_EMAIL, "adam.gerard@gmail.com", true);
        Test.runStringTest(Constants.WEAK_EMAIL, "3ay4ya4y@@@@", false);
        Test.runStringTest(Constants.WEAK_EMAIL, "as", false);

        Test.runStringTest(Constants.STRONG_EMAIL, "as@.324.53253.c", false);
        Test.runStringTest(Constants.STRONG_EMAIL, "a@b.c", true);
        Test.runStringTest(Constants.STRONG_EMAIL, "adam.gerard@gmail.com", true);
        Test.runStringTest(Constants.STRONG_EMAIL, "3ay4ya4y@@@@", false);
        Test.runStringTest(Constants.STRONG_EMAIL, "as", false);

        Test.runStringTest(Constants.ALPHA_NUMERIC, "a3536a3635#%#%", false);
        Test.runStringTest(Constants.ALPHA_NUMERIC, "asAAGGE323GE", true);
        Test.runStringTest(Constants.ALPHA_NUMERIC, "SFEF25353253zghhh", true);
        Test.runStringTest(Constants.ALPHA_NUMERIC, "3a5353535ra3535253", true);
        Test.runStringTest(Constants.ALPHA_NUMERIC, "gage325353.", false);

        Test.runStringTest(Constants.SIMPLE_SENTENCE, "I am a sentence.", true);
        Test.runStringTest(Constants.SIMPLE_SENTENCE, "I kinda trail offfff!", true);
        Test.runStringTest(Constants.SIMPLE_SENTENCE, "gage325353rat2a325@@$#@", false);
        Test.runStringTest(Constants.SIMPLE_SENTENCE, "aggoageigjwegjgpoe...", false);
        Test.runStringTest(Constants.SIMPLE_SENTENCE, "sfsfe!!!!", false);
    }



}