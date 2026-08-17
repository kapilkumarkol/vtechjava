import java.lang.reflect.Field;

class User {
    public String name;
    protected int age;
    String email;
    float rank;
}

class A {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException {
        User user = new User();

        user.name = "Yam";
        user.age = 1000;
        user.email = "yam@narak.com";
        user.rank = 1;

        Class klass = user.getClass();

        Field[] fields = klass.getDeclaredFields();

        for(Field field : fields) {
            // System.out.println(field);
            System.out.println(field.getType().getName() + " " + field.getName() + " = " + field.get(user));
        }
    }
}