package io.thoughtscript.refresh.abstraction;

public abstract class ParentAbstractClassExample {

    abstract void getNickname();

    public void getName() {
        System.out.println("Parent abstract class example");
    }

    public void superMethod() {
        System.out.println("I am in the parent abstract class");
    }

    abstract void abstractSuperMethod();

}
