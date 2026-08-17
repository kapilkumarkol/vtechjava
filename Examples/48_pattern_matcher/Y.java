import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);

        while(m.find()) {
            System.out.println("Match: "+m.group()+" Start: "+m.start()+" End: "+m.end());
        }
    }
}