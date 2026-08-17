import java.util.Arrays;
import java.util.Comparator;

class A {
    public static void main(String[] args) {
        int val = Integer.parseInt(args[0]);

        Comparator<Student> comp = null;

        switch(val) {
            case 1:
                comp = new NameSort();
                break;
            case 2:
                comp = new AgeSort();
        }
        
        Student[] x  = {
                            new Student("indra", 5), 
                            new Student("rohan", 12),
                            new Student("golu", 7),
                            new Student("tinku", 16),
                            new Student("jay", 9)         
                       };
        
        Arrays.sort(x, comp);
    
        for(Student s : x) {
            System.out.print(s+", ");
        }   
        
        Student s = new Student("baku", 13);

        System.out.println();
        System.out.println(Arrays.binarySearch(x, s, comp));
    }
}

class NameSort implements Comparator<Student> {
    public int compare(Student x, Student y) {
        return x.name.compareTo(y.name);
    }
}

class AgeSort implements Comparator<Student> {
    public int compare(Student x, Student y) {
        return x.age.compareTo(y.age);
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
        return name + "-" + age;
    }
}