import java.lang.reflect.Method;

class Student {
    void login() {

    }

    public void signup() {

    }

    void logout() {

    }
}

class A {
    public static void main(String[] args) {
        Class klass = Student.class;

        Method[] methods = klass.getMethods();

        for(Method method : methods) {
            System.out.println(method);
        }
    }
}