import java.io.Serializable;

class Employee implements Serializable{
    String name;
    int age;
    MyAddress address;
    
    Employee(String name, int age, MyAddress address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
