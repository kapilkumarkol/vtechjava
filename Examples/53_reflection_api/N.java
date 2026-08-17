import java.lang.reflect.Constructor;

class Employee {
    Employee(String name) {

    }

    public Employee(String name, float salary) {

    }

    Employee(String name, int age, float salary) {

    }
}

class A {
    public static void main(String[] args) {
        Class klass = Employee.class;

        Constructor[] constructors = klass.getConstructors();
        
        for(Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}