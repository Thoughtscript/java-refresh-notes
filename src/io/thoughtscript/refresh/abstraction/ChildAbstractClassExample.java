package io.thoughtscript.refresh.abstraction;

public class ChildAbstractClassExample extends ParentAbstractClassExample {

    public void getNickname() {
        System.out.println("I'm the abstract child class abstract method implementation");
    }

    public void abstractSuperMethod() {
        System.out.println("I'm in the abstract child class implementation");
    }
}
