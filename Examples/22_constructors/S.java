class Student {
    String name;
    int age;
    String semester;
    String degree;
}

class Teacher {
    String name;
    int age;
    String designation;
    int experience;
}

class A {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "om";
        s.age = 21;
        s.semester = "3rd";
        s.degree = "BTech"; 

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.semester);

        Teacher t = new Teacher();

        t.name = "mohan";
        t.age = 32;
        t.designation = "manager";
        t.experience = 8;

        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.designation);
        System.out.println(t.experience);
    }
}