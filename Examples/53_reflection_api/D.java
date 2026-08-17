import java.lang.reflect.Field;

class User {
    public String name;
    int age;
    String email;
    public float rank;
}

class A {
    public static void main(String[] args) {
        Class klass = User.class;

        Field[] fields = klass.getFields(); 

        for(Field field : fields) {
            System.out.println(field);
        }
    }
}