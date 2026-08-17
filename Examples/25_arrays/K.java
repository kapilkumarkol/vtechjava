import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[5];

        for(int i=0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        System.out.println("+++++++++++++++");

        for(int i=0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("+++++++++++++++");
        
        for(int i=0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}