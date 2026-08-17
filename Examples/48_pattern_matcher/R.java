import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("[a-zA-Z]");
        Pattern p = Pattern.compile("[a-zA-Z0-9]");
        // Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher("3_%#w Tq_@");

        while(m.find()) {
            System.out.println("Match: "+m.group()+" Start: "+m.start()+" End: "+m.end());
        }
    }
}