import java.util.Arrays;

class A {
    public static void main(String[] args) {
        Student[] x  = {
                            new Student("indra", 5), 
                            new Student("rohan", 12),
                            new Student("golu", 7),
                            new Student("tinku", 16),
                            new Student("jay", 9)         
                       };

        for(Student s : x) {
            System.out.print(s+", ");
        }
        
        Arrays.sort(x);

        for(Student s : x) {
            System.out.print(s+", ");
        }
    }
}

class Student {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }
}