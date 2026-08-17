import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int count = sc.nextInt();

        Student[] x = new Student[count];

        for(int i=0;i<x.length; i++) {
            System.out.println(x[i]);
        }

        System.out.println("++++++++++++++++");

        for(int i=0;i<x.length; i++) { 
            System.out.print("Enter Student's Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter Student's Age: ");
            int age = sc.nextInt();
            x[i] = new Student(name, age);
        }

        System.out.println("++++++++++++++++");
        
        // x[0] = new Student("om", 12);
        // x[1] = new Student("ram", 19);
        // x[2] = new Student("tanishk", 21);

        for(int i=0;i<x.length; i++) {
            System.out.println(x[i]);
        }
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