import java.util.Scanner;

class A {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int y = sc.nextInt();

            int t = 12 / y;
        } catch(ArithmeticException e) {
            throw new IllegalArgumentException();
            //converting from one exception to another ...
        }
    }
}