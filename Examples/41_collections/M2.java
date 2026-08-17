import java.util.TreeMap;

class A {
    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<Student, String>();
        
        map.put(new Student("jay", 23), "JEC");
        map.put(new Student("sagar", 13), "Global");
        map.put(new Student("vinay", 18), "GGCT");
        map.put(new Student("ritik", 20), "GGITS");
        map.put(new Student("babbar", 16), "SRIT");

        System.out.println(map);
    }
}

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int compareTo(Student o) {
        Student x = this;
        Student y = (Student)o;

        String nm1 = x.name;
        String nm2 = y.name;

        return nm1.compareTo(nm2);
    }
}