class User {
    String name;
    int age;
}

class Student extends User {
    // String name;
    // int age;
    String semester;
    String degree;

    Student(String name, int age, String semester, String degree) {
        this.name = name;
        this.age = age;
        this.semester = semester;
        this.degree = degree;
    }
}

class Teacher extends User {
    // String name;
    // int age;
    String designation;
    int experience;

    Teacher(String name, int age, String designation, int experience) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.experience = experience;
    }
}

class A {
    public static void main(String[] args) {
        Student s = new Student("ramanna", 18, "1st", "BTech");

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.semester);

        Teacher t = new Teacher("S. Laxman", 38, "Manager", 7);

        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.designation);
        System.out.println(t.experience);
    }
}