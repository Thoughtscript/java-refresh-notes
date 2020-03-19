package io.thoughtscript.refresh.interfaces;

public class ImplementationExample implements ChildInterfaceExample {

    int id = 0;

    public void getName() {
        System.out.println("I am an interface implementation example");
    }

    public void setId(int id){
        this.id = id;
        System.out.println("ID set to: " + id);
    }

    public void getNextOfHierarchy(){
        System.out.println("I am the next hierarchy message");
    }

    public void getId() {
        System.out.println(String.valueOf(this.id));
    }
}
