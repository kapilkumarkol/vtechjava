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

class Student implements Comparable {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Object o) {
        Student x1 = this;
        Student x2 = (Student)o;

        String nm1 = x1.name;
        String nm2 = x2.name;

        return nm1.compareTo(nm2);    
    }

    public String toString() {
        return name + " - " + age;
    }
}