package io.thoughtscript.refresh.arrays;

public class ArrayDeclarations {

    public static void arrayDeclarations() {

        //[false, false, false]
        boolean[] boolArrayByDefaultValAndSpecifiedSize = new boolean[3];
        for (boolean b: boolArrayByDefaultValAndSpecifiedSize) {
            System.out.println(b);
        }

        //[0,0,...,0]
        int[] intArrayByDefaultValAndSpecifiedSize = new int[4];
        for (int b: intArrayByDefaultValAndSpecifiedSize) {
            System.out.println(b);
        }

        //[null,null,...,null]
        String[] stringArrayByDefaultValAndSpecifiedSize = new String[5];
        for (String b: stringArrayByDefaultValAndSpecifiedSize) {
            System.out.println(b);
        }

        //[33,3,4,5]
        int[] intArrayByCurlyBraces = {33,3,4,5};
        for (int b: intArrayByCurlyBraces) {
            System.out.println(b);
        }
    }
}
