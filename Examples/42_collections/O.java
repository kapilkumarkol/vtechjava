import java.util.Arrays;
import java.util.Comparator;

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
        
        Arrays.sort(x, new NameSort());
        System.out.println("\n++++++++++++");

        for(Student s : x) {
            System.out.print(s+", ");
        }
    }
}

class NameSort implements Comparator<Student> {
    public int compare(Student x, Student y) {
        return x.name.compareTo(y.name);
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