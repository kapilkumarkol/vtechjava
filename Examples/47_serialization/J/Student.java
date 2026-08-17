import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name+" - "+age;
    }
}
