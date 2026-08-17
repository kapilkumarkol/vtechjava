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
        this.semester = semester;
        this.degree = degree;
    }

    // public String toString() {
    //     return name+age+semester+degree;
    // }
}

class Teacher extends User {
    String designation;
    int experience;

    Teacher(String name, int age, String designation, int experience) {
        super(name, age);
        this.designation = designation;
        this.experience = experience;
    }

    // public String toString() {
    //     return name+age+designation+experience;
    // }
}

class A {
    public static void main(String[] args) {
        Student s = new Student("ganesh", 20, "4st", "BE");
        
        System.out.println(s);

        Teacher t = new Teacher("Kumar Swami", 35, "Manager", 4);
        
        System.out.println(t);
    }
}