import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("mohan");
        
        Matcher m = p.matcher("mohan is in class 12th and mohan is my friend and mohan is a good boy");
                       
        // find call is skipped...
        
        // System.out.println(m.group());
        // Exception in thread "main" java.lang.IllegalStateException: No match found

        // System.out.println(m.start());
        // System.out.println(m.end());
        // Exception in thread "main" java.lang.IllegalStateException: No match available
    }
}
