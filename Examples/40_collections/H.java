import java.util.TreeSet;

class A {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();

        set.add(new Student("gopal", 23));
        set.add(new Student("vikram", 12));
        set.add(new Student("yam", 9));
        set.add(new Student("hitesh", 18));
        set.add(new Student("ajeet", 12));
        set.add(new Student("samyak", 20));

        System.out.println(set);
    }
}

class Student implements Comparable<Student> {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student o) {

        String nm1 = this.name;
        String nm2 = o.name;

        return nm1.compareTo(nm2);
    }

    public String toString() {
        return name + " - " + age;
    }
}