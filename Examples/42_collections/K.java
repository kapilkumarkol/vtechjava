import java.util.Arrays;

class A {
    public static void main(String[] args) {
        char[] x = {'j','T',' ','a','1'};

        for(char y : x) {
            System.out.print(y+" ");
        }
        
        Arrays.sort(x);
        System.out.println("\n+++++++");

        for(char y : x) {
            System.out.print(y+" ");
        }
    }
}