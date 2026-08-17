class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

class A {
    public static void main(String[] args) {
        Student s = new Student("rohan", 23);
        
        System.out.println(s);
        System.out.println(s.toString());

        Student t = new Student("tiket", 20);
        System.out.println(t);
        System.out.println(t.toString());
    }
}