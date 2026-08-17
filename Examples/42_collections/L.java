import java.util.Arrays;

class A {
    public static void main(String[] args) {
        String[] x = {"a ", "T", " j", " Y"};

        for(String y : x) {
            System.out.print(y+" ");
        }
        
        Arrays.sort(x);
        System.out.println("\n+++++++");

        for(String y : x) {
            System.out.print(y+" ");
        }
    }
}