import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
        // Matcher m = p.matcher("mohan23_#@gmail.com");
        Matcher m = p.matcher("mohan23_@gmail.com");

        if(m.matches()) {
            System.out.println("Match: "+m.group()+" Start: "+m.start()+" End: "+m.end());
        }
    }
}