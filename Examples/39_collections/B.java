import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        Student s1 = new Student("om", 12);
        Student s2 = new Student("vikas", 18);
        Student s3 = new Student("jamdagni", 15);
        Student s4 = new Student("ghatotkatch", 9);
        Student s5 = new Student("barbareek", 14);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println(list);

        // Student x = new Student("vikas", 18);
        Student x = new Student("vikas", 23);
        System.out.println(list.remove(x));
        
        System.out.println(list);
    }
}

class Student {
    String name;
    int age;

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object o) {
        Student st1 = this;
        Student st2 = (Student)o;

        String nm1 = st1.name;
        String nm2 = st2.name;

        return nm1.equals(nm2);
    }


    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}