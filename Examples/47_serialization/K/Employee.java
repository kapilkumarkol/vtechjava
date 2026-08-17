import java.io.Serializable;

class Employee implements Serializable {
    String name;
    int salary;
    
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name+" - "+salary;
    }
}
