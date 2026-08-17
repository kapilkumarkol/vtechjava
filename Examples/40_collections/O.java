import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Press 1 for Name Asc \n Press 2 for Name Dsc \n Press 3 for Age Asc \n Press 4 for Age Dsc : ");
        int input = sc.nextInt();

        Comparator comp = null;

        if(input == 1) {
            comp = new StudentNameAscSort();
        } else if(input == 2) {
            comp = new StudentNameDescSort();
        } else if(input == 3) {
            comp = new StudentAgeAscSort();
        } else if(input == 4) {
            comp = new StudentAgeDescSort();
        } 
        
        PriorityQueue queue = new PriorityQueue(comp);

        queue.offer(new Student("om", 12));
        queue.offer(new Student("om", 12));
        queue.offer(new Student("ram", 14));
        queue.offer(new Student("tilak", 9));
        queue.offer(new Student("amrendra", 4));
        queue.offer(new Student("vikram", 18));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}

class StudentNameAscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        String nm1 = s1.name;
        String nm2 = s2.name;

        return nm1.compareTo(nm2);
    }
}

class StudentNameDescSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        String nm1 = s1.name;
        String nm2 = s2.name;

        return nm2.compareTo(nm1);
    }
}

class StudentAgeAscSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        Integer ag1 = s1.age;
        Integer ag2 = s2.age;
        
        return ag1.compareTo(ag2);
    }
}

class StudentAgeDescSort implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        Integer ag1 = s1.age;
        Integer ag2 = s2.age;
        
        return ag2.compareTo(ag1);
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