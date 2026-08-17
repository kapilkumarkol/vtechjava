import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(new Student("om", 12));
        set.add(new Student("ram", 14));
        set.add(new Student("tilak", 9));
        set.add(new Student("amrendra", 4));
        set.add(new Student("vikram", 18));

        System.out.println(set);
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