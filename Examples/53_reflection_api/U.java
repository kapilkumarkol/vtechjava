import java.io.EOFException;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Date;

class Student {
    public static final synchronized Student login(String email, String password) throws FileNotFoundException, EOFException {
        return null;
    }

    public boolean signup(float y, double w) throws ArrayIndexOutOfBoundsException {
        return true;
    }

    void logout(Date date) throws ClassNotFoundException, IllegalArgumentException, ArithmeticException {

    }
}

class A {
    public static void main(String[] args) {
        Class klass = Student.class;

        Method[] methods = klass.getDeclaredMethods();

        for(Method method : methods) {
            Type[] types = method.getGenericParameterTypes();

            for(Type type : types) {
                System.out.print(type.getTypeName()+" ");
            }

            System.out.println();
        }
    }
}