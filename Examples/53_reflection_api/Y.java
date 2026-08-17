import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

class Employee {
    private Employee(String name) throws IOException {

    }

    public Employee(String name, float salary) throws ArithmeticException, IllegalArgumentException {

    }

    protected Employee(String name, int age, float salary) throws ArrayIndexOutOfBoundsException {

    }

    Employee() {
        
    }
}

class A {
    public static void main(String[] args) {
        Class klass = Employee.class;

        Constructor[] constructors = klass.getDeclaredConstructors();
        
        for(Constructor constructor : constructors) {
            Type[] types = constructor.getGenericExceptionTypes();

            for(Type type : types) {
                System.out.print(type.getTypeName()+" ");
            }

            System.out.println();
        }
    }
}