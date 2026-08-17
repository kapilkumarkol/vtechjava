import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class User {
    public static final String name = "om";
    protected transient int age;
    String email;
    float rank;
}

class A {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException {
        User user = new User();

        // user.name = "Yam";
        user.age = 1000;
        user.email = "yam@narak.com";
        user.rank = 1;

        Class klass = user.getClass();

        Field[] fields = klass.getDeclaredFields();

        for(Field field : fields) {
            int mod = field.getModifiers();

            String modifiers = Modifier.toString(mod);
            System.out.print(modifiers+" ");
            System.out.println(field.getType().getName() + " " + field.getName() + " = " + field.get(user)+";");
        }
    }
}