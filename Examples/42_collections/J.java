import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] x = {45, 12, 8, 34, 22};

        for(int y : x) {
            System.out.print(y+" ");
        }
        
        Arrays.sort(x);
        System.out.println("\n+++++++");

        for(int y : x) {
            System.out.print(y+" ");
        }
    }
}