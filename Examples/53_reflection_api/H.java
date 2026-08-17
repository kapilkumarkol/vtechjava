
//Case 1:
// public final class H {

// }

//Case 2:
public abstract class H {

}

class A {
    public static void main(String[] args) {
        Class klass = H.class;

        int x = klass.getModifiers();

        System.out.println(x);
    }
}