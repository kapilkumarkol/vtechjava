class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends User {
    String semester;
    String degree;

    Student(String name, int age, String semester, String degree) {
        super(name, age);
        // this.name = name;
        // this.age = age;
        this.semester = semester;
        this.degree = degree;
    }
}

class Teacher extends User {
    String designation;
    int experience;

    Teacher(String name, int age, String designation, int experience) {
        super(name, age);
        // this.name = name;
        // this.age = age;
        this.designation = designation;
        this.experience = experience;
    }
}

class A {
    public static void main(String[] args) {
        Student s = new Student("ganesh", 20, "4st", "BE");

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.semester);

        Teacher t = new Teacher("Kumar Swami", 35, "Manager", 4);

        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.designation);
        System.out.println(t.experience);
    }
}