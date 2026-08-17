import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[j-s]");
        Matcher m = p.matcher("vijay singh");

        while(m.find()) {
            System.out.println("Match: "+m.group()+" Start: "+m.start()+" End: "+m.end());
        }
    }
}