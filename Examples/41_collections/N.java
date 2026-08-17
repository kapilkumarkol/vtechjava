import java.util.TreeMap;
import java.util.Comparator;

class A {
    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<Student, String>(new AgeSort());
        
        map.put(new Student("jay", 23), "JEC");
        map.put(new Student("sagar", 13), "Global");
        map.put(new Student("vinay", 18), "GGCT");
        map.put(new Student("ritik", 20), "GGITS");
        map.put(new Student("babbar", 16), "SRIT");

        System.out.println(map);
    }
}

class AgeSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student x = (Student)o1;
        Student y = (Student)o2;

        Integer ag1 = x.age; 
        Integer ag2 = y.age; 

        return  ag1.compareTo(ag2);
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