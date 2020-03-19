package io.thoughtscript.refresh.visibility;

public class VisibilityExamples {

    private void privateMethod() {
        System.out.println("I'm a private method");
    }

    protected void protectedMethod() {
        System.out.println("I'm a protected method");
    }

    public void runExample() {
        System.out.println("Private - Class Only, Default - Package Only, Protected - Package and Subclasses, Public - All");
        System.out.println("Default and Public can be assigned to classes");

        privateMethod();

        DefaultVisibility defaultVisibility = new DefaultVisibility();
        defaultVisibility.defaultMethod();

        protectedMethod();

        PublicVisibility publicVisibility = new PublicVisibility();
        publicVisibility.publicMethod();

    }
}
