package Prototype.EX2;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("IT");
        City city = new City("Poznan", department);
        Worker worker = new Worker(city, "44", "Joch");
        Worker worker2 ;

        worker2 = (Worker) worker.clone();
        worker2.name= "Wendi";
        worker2.city.department.name="hr" ;


        System.out.println(worker);
        System.out.println(worker2);




    }
}
