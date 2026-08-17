import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Press 1 for Name Asc \n Press 2 for Name Dsc \n Press 3 for Age Asc \n Press 4 for Age Dsc : ");
        int input = sc.nextInt();

        Comparator<Student> comp = null;

        if(input == 1) {
            comp = new NameSort();
        } else if(input == 2) {
            comp = new NameRevSort();
        } else if(input == 3) {
            comp = new AgeSort();
        } else if(input == 4) {
            comp = new AgeRevSort();
        } 
        
        TreeSet<Student> set = new TreeSet<Student>(comp);

        set.add(new Student("gopal", 23));
        set.add(new Student("vikram", 12));
        set.add(new Student("yam", 9));
        set.add(new Student("hitesh", 18));
        set.add(new Student("ajeet", 12));
        set.add(new Student("samyak", 20));

        System.out.println(set); 
        
        sc.close();
    }
}

class NameSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class NameRevSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.name.compareTo(o1.name);
    }
}

class AgeSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.age.compareTo(o2.age);
    }
}

class AgeRevSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.age.compareTo(o1.age);
    }
}

class Student {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}