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

        // Comparator<Student> comp = new NameSort();
        // Comparator<Student> comp = new AgeSort();
        Comparator<Student> comp = new NameRevSort();

        Collections.sort(list, comp);

        Student x = new Student("vijay", 8);
        System.out.println(Collections.binarySearch(list, x, comp));
    }
}

class NameSort implements Comparator<Student> {
    public int compare(Student s, Student t) {
        return s.name.compareTo(t.name);
    }
}

class NameRevSort implements Comparator<Student> {
    public int compare(Student s, Student t) {
        return t.name.compareTo(s.name);
    }
}

class AgeSort implements Comparator<Student> {
    public int compare(Student s, Student t) {
        return s.age.compareTo(t.age);
    }
}

class AgeRevSort implements Comparator<Student> {
    public int compare(Student s, Student t) {
        return t.age.compareTo(s.age);
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