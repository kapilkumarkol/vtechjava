import java.util.Scanner;

class A {
    public static void main(String[] args) {
        int[] x = {4, 5, 8, 1, 3, 4, 8, 5, 7, 5, 2};

        // ----------------------          
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int val = sc.nextInt();

        int count = 0;

        for(int i=0; i < x.length; i++) {
            if(x[i] == val) {
                count++;
            }        
        }
        
        System.out.println(count+" ");
        // ----------------------
    }
}