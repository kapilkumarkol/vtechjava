import java.lang.reflect.Field;

class User {
    public String name;
    protected int age;
}

class Student extends User {
    public String college;
    int semester;
}

class A {
    public static void main(String[] args) {
        Class klass = Student.class;

        // Field[] fields = klass.getFields(); 
        Field[] fields = klass.getDeclaredFields(); 

        for(Field field : fields) {
            System.out.println(field);
        }
    }
}