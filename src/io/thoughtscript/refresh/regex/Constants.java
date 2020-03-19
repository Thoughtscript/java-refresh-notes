package io.thoughtscript.refresh.regex;

class Constants {

    static final String SPECIAL_CHAR = "[\\^\\[\\]{}$\\\\\\/<>~`!@#$%^&*()\\-_+=|?,.\"':;]+";
    static final String WEAK_HTML = "<[a-z0-9]+>.*<\\/[a-z0-9]+>";
    static final String STRONG_HTML = "<[a-z0-9\"'\\s=]+>.+<\\/[a-z0-9]+>";
    static final String WEAK_EMAIL = ".+@.+\\..+";
    static final String STRONG_EMAIL = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    static final String ALPHA_NUMERIC = "^[A-Za-z0-9\\s]*$";
    static final String SIMPLE_SENTENCE = "^[A-Za-z0-9\\s]*[\\.?!]{1}$";

}