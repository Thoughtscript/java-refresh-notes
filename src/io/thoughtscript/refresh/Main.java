package io.thoughtscript.refresh;

import io.thoughtscript.refresh.abstraction.ConcreteClassExample;
import io.thoughtscript.refresh.arrays.ArrayDeclarations;
import io.thoughtscript.refresh.arrays.ArrayListDeclarations;
import io.thoughtscript.refresh.interfaces.ImplementationExample;
import io.thoughtscript.refresh.regex.Regex;
import io.thoughtscript.refresh.ood.ChildClass;
import io.thoughtscript.refresh.visibility.VisibilityExamples;

import java.beans.Visibility;

class Main {
    private static final String LINE_BREAK = System.getProperty("line.separator");

    public static void main(String[] args) {
        try {
            Regex.runExamples();

            ArrayListDeclarations.arrayListDeclarations();
            System.out.println(LINE_BREAK);

            ArrayDeclarations.arrayDeclarations();
            System.out.println(LINE_BREAK);

            ChildClass ood = new ChildClass();
            ood.getId();
            ood.getName();
            System.out.println(LINE_BREAK);

            VisibilityExamples visibility = new VisibilityExamples();
            visibility.runExample();
            System.out.println(LINE_BREAK);

            ConcreteClassExample polymorphism = new ConcreteClassExample();
            polymorphism.getName();
            polymorphism.getNickname();
            polymorphism.abstractSuperMethod();
            polymorphism.superMethod();
            System.out.println(LINE_BREAK);

            ImplementationExample hierarchy = new ImplementationExample();
            hierarchy.getName();
            hierarchy.setId(4);
            hierarchy.getId();
            hierarchy.getNextOfHierarchy();
            System.out.println(LINE_BREAK);

        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
}