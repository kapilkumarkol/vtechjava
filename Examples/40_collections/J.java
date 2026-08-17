import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Press 1 for Name Asc \n Press 2 for Name Dsc \n Press 3 for Age Asc \n Press 4 for Age Dsc : ");
        int input = sc.nextInt();

        Comparator comp = null;

        if(input == 1) {
            comp = new NameSort();
        } else if(input == 2) {
            comp = new NameRevSort();
        } else if(input == 3) {
            comp = new AgeSort();
        } else if(input == 4) {
            comp = new AgeRevSort();
        } 
        
        TreeSet set = new TreeSet(comp);

        set.add(new Student("gopal", 23));
        set.add(new Student("vikram", 12));
        set.add(new Student("yam", 9));
        set.add(new Student("hitesh", 18));
        set.add(new Student("ajeet", 12));
        set.add(new Student("samyak", 20));

        System.out.println(set);        
    }
}

class NameSort implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Student)o1).name.compareTo(((Student)o2).name);
    }
}

class NameRevSort implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Student)o2).name.compareTo(((Student)o1).name);
    }
}

class AgeSort implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Student)o1).age.compareTo(((Student)o2).age);
    }
}

class AgeRevSort implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Student)o2).age.compareTo(((Student)o1).age);
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