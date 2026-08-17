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
    }
}

class Student {
    String name;
    int age;

    public String toString() {
        return name + " - " + age;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}