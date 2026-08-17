class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }
}

class A {
    public static void main(String[] args) {
        Student s1 = new Student("om", 18);
        
        System.out.println(s1.name);
        System.out.println(s1.age);       
    }
}