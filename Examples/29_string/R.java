import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();

        String x = String.format("My name is: %s\nMy Age is: %d\nMy Marks: %.2f", name, age, marks);
    
        System.out.println(x);
    }
}