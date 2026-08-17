import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet dholakpur = new HashSet();

        dholakpur.add(new Employee("golu", 34));
        dholakpur.add(new Employee("bheem", 42));
        dholakpur.add(new Employee("chutki", 28));
        dholakpur.add(new Employee("raju", 4));
        dholakpur.add(new Employee("jaggu", 12));
        dholakpur.add(new Employee("kaliya", 30));
        dholakpur.add(new Employee("golu", 34));

        System.out.println(dholakpur);
    }
}

class Employee {
    String name;
    int age; 

    public String toString() {
        return name + " - " + age+"\n";
    }

    public boolean equals(Object o) {
        Employee e1 = this;
        Employee e2 = (Employee)o;

        String nm1 = e1.name;
        String nm2 = e2.name;

        return nm1.equals(nm2);
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}