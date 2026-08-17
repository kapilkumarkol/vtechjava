import java.lang.reflect.Method;

class Student {
    protected void login() {

    }

    public void signup() {

    }

    private void logout() {

    }

    void showProfile() {
        
    }
}

class A {
    public static void main(String[] args) {
        Class klass = Student.class;

        // Method[] methods = klass.getMethods();
        Method[] methods = klass.getDeclaredMethods();

        for(Method method : methods) {
            System.out.println(method);
        }
    }
}