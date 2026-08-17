import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] x = {45, 18, 2, 12, 8, 34, 22};
       

        Arrays.sort(x);

        for(int y : x) {
            System.out.print(y+" ");
        }
        System.out.println();

        System.out.println(Arrays.binarySearch(x, 12));
    }
}