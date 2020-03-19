package io.thoughtscript.refresh.abstraction;

public class ConcreteClassExample extends ChildAbstractClassExample {

    public void getNickname() {
        System.out.println("I'm the concrete class abstract method implementation");
    }

    @Override
    public void getName() {
        System.out.println("Concrete class example");
    }
}
