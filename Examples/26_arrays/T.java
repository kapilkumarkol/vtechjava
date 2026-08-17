import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] x = new int[2][];

        x[0] = new int[5];
        x[1] = new int[3];

        for(int i=0; i < x.length; i++) {
            for(int j=0; j < x[i].length; j++) {
                System.out.print(x[i][j]+" ");
            }

            System.out.println();
        }

        for(int i=0; i < x.length; i++) {
            for(int j=0; j < x[i].length; j++) {
                x[i][j] = sc.nextInt();
            }

            System.out.println();
        }

        for(int i=0; i < x.length; i++) {
            for(int j=0; j < x[i].length; j++) {
                System.out.print(x[i][j]+" ");
            }

            System.out.println();
        }
    }
}