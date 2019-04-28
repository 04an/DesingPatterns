package Prototype.EX2;

public class City implements Cloneable {
    String name;
    Department department;

    public City(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
