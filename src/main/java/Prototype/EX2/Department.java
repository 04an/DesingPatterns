package Prototype.EX2;

public class Department implements Cloneable{
    String name;

    public Department(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
