import java.util.ArrayList;

final class Student {
    private String name;
    private int age;
    private ArrayList<Integer> marks;

    public Student(String name, int age, ArrayList<Integer> marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class A {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(78);
        marks.add(89);
        marks.add(67);

        Student s = new Student("hitesh", 18, marks);

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getMarks());

        ArrayList<Integer> x = s.getMarks();

        x.add(90);
        x.add(82);

        System.out.println("~~~~~~~~~~~~~~~~~");

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getMarks());
    }
}