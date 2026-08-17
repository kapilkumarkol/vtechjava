import java.util.HashMap;

class A {
    public static void main(String[] args) {
        HashMap<Student,College> x = new HashMap<Student,College>();

        x.put(new Student("om", 23), new College("JEC"));
        x.put(new Student("ekta", 22), new College("LNCT"));
        x.put(new Student("rohit", 19), new College("SRIT"));
        x.put(new Student("mahendra", 18), new College("GGITS"));
        x.put(new Student("amrendra", 21), new College("Global"));

        System.out.println(x);
    }
}



class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

class College {
    String name;

    College(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}