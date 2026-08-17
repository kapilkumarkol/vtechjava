import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class A {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>(); 

        list.add(new Student("golu", 12));
        list.add(new Student("jay", 7));
        list.add(new Student("raju", 16));
        list.add(new Student("jaggu", 10));
        list.add(new Student("yam", 4));
        list.add(new Student("ganesh", 20));

        System.out.println(list);

        // Collections.sort(list);
        Collections.sort(list, new NameSort());

        System.out.println(list);
    }
}

class NameSort implements Comparator<Student> {
    public int compare(Student s, Student t) {
        return s.name.compareTo(t.name);
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
        return name + " - " + age;
    }
}