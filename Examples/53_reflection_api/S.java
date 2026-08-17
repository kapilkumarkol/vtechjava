import java.lang.reflect.Method;

class Student {
    public static final synchronized Student login(String email, String password) {
        return null;
    }

    public boolean signup(String name, String city, String email, String password ) {
        return true;
    }

    void logout() throws ClassNotFoundException, IllegalArgumentException, ArithmeticException {

    }
}

class A {
    public static void main(String[] args) {
        Class klass = Student.class;

        Method[] methods = klass.getDeclaredMethods();

        for(Method method : methods) {
            // System.out.println(method);
            Class kl = method.getReturnType();
            System.out.println(kl.getName() + " " + method.getName());
        }
    }
}