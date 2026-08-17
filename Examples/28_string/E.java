class A {
    public static void main(String[] args) {
        Student s1 = new Student("om", 12);
        Student s2 = new Student("om", 12);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

