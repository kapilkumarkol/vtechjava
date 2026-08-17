import java.util.TreeMap;
import java.util.Comparator;

class A {
    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<Student, String>(new NameSort());
        
        map.put(new Student("jay", 23), "JEC");
        map.put(new Student("sagar", 13), "Global");
        map.put(new Student("vinay", 18), "GGCT");
        map.put(new Student("ritik", 20), "GGITS");
        map.put(new Student("babbar", 16), "SRIT");

        System.out.println(map);
    }
}

class NameSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return  o1.name.compareTo(o2.name);
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