import java.lang.reflect.Field;

class User {
    public String name;
    protected int age;
    private String email;
    float rank;
}

class A {
    public static void main(String[] args) {
        Class klass = User.class;

        Field[] fields = klass.getFields(); 
        // Field[] fields = klass.getDeclaredFields(); 

        for(Field field : fields) {
            System.out.println(field);
        }
    }
}