import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("mohan");
        
        Matcher m = p.matcher("mohan is in class 12th and mohan is my friend and mohan is a good boy");
        
        System.out.println(m);

        boolean flag = m.find();
        System.out.println(flag);
        
        System.out.println(m);

    }
}