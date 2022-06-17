package models;

public class ClassB {
    private String name;
    private ClassA linkToA;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassA getLinkToA() {
        return linkToA;
    }

    public void setLinkToA(ClassA linkToA) {
        this.linkToA = linkToA;
    }
}
