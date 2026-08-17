class Student {
    String name;
    int age;
    static int maxAge = 20;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ram";
        s1.age = 12;
        s1.maxAge = 45;

        Student s2 = new Student();
        s2.name = "om";
        s2.age = 23;
        s2.maxAge = 78;

        System.out.println(s1.maxAge);
        System.out.println(s2.maxAge);
    }
}