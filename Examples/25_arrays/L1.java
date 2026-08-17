class A {
    public static void main(String[] args) {
        Student[] x = new Student[3];

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        
        x[0] = new Student("om", 12);
        x[1] = new Student("ram", 19);
        x[2] = new Student("tanishk", 21);

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
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