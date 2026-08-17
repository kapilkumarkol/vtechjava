import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z&&[def]]");
        Matcher m = p.matcher("machine length 15 inches and width 7 inches");

        while(m.find()) {
            System.out.println("Match: "+m.group()+" Start: "+m.start()+" End: "+m.end());
        }
    }
}