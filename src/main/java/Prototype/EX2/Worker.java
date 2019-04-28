package Prototype.EX2;

public class Worker implements Cloneable {
    City city;
    String id;
    String name;

    public Worker(City city, String id, String name) {
        this.city = city;
        this.id = id;
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException {
        Worker worker = (Worker) super.clone();
        worker.city = (City) city.clone();
        worker.city.department = (Department) city.department.clone();
        return worker;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "City=" + city +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
