import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class Employee {
    private Employee(String name) {

    }

    public Employee(String name, float salary) {

    }

    protected Employee(String name, int age, float salary) {

    }

    Employee() {
        
    }
}

class A {
    public static void main(String[] args) {
        Class klass = Employee.class;

        Constructor[] constructors = klass.getDeclaredConstructors();
        
        for(Constructor constructor : constructors) {
            // System.out.println(constructor);
            System.out.print(Modifier.toString(constructor.getModifiers())+" ");
            System.out.println(constructor.getName());

        }
    }
}