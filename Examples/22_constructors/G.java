class Student {
    String name;
    int age;
}

class A {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        System.out.println(s1.name);
        System.out.println(s1.age);

        s1.name = "mohan";
        s1.age = 12;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}