import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

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
            Type[] types = constructor.getGenericParameterTypes();

            for(Type type : types) {
                System.out.print(type.getTypeName()+" ");
            }

            System.out.println();
        }
    }
}