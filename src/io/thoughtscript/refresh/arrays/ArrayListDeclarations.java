package io.thoughtscript.refresh.arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDeclarations {

    public static void arrayListDeclarations() {

        List<String> arrayListUsingCurlyBraces = new ArrayList() {{
            add("A");
            add("B");
            add("C");
        }};
        System.out.println(arrayListUsingCurlyBraces.toString());

        ArrayList<String> arrayListWithArraysAsList = new ArrayList<>(Arrays.asList("Animal", "Baseball", "Cat"));
        System.out.println(arrayListWithArraysAsList.toString());

        List<String> arrayListByManualAddition = new ArrayList<>();
        arrayListByManualAddition.add("exampleOne");
        arrayListByManualAddition.add("exampleTwo");
        System.out.println(arrayListByManualAddition.toString());

    }
}
