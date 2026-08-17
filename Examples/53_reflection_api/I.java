import java.lang.reflect.Modifier;

//Case 1:
public final class I {

}

// Case 2:
// public abstract class I {

// }

class A {
    public static void main(String[] args) {
        Class klass = I.class;

        int x = klass.getModifiers();

        System.out.println(Modifier.toString(x));
    }
}