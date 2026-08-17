import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("sohan");
        
        Matcher m = p.matcher("sohan is in class 12th and sohan is my friend and sohan is a good boy");
                       
        while(m.find()) {
            System.out.println(m.group());
            System.out.println(m.start());
            System.out.println(m.end());
        }
    }
}
