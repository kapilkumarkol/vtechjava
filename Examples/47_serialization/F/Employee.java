import java.io.Serializable;

class Employee implements Serializable{
    String name;
    int age;
    transient String address = "Dholakpur";
    
    Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
