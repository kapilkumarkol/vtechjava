class Employee {
    String name;
    int age;

    public static void main(String[] args) {
        Employee s1 = new Employee();
        s1.name = "ram";
        s1.age = 34;

        Employee s2 = new Employee();
        s2.name = "om";
        s2.age = 43;

        s1.showInfo();
    }

    void showInfo() {
        System.out.print(name);
        System.out.print(age);
    }
}