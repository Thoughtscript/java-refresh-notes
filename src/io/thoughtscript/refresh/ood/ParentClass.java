package io.thoughtscript.refresh.ood;

public class ParentClass {

    private int id = 0;
    private String name = "Parent";

    public ParentClass() { }

    public ParentClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getId () {
        System.out.println(this.id);
    }

    public void getName () {
        System.out.println(this.name);
    }
}
