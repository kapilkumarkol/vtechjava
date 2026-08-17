import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("0X[0-9a-f]{2}");
        Matcher m = p.matcher("0X7 is in class 1oth and mohan is my friend");
        // Matcher m = p.matcher("0X7a is in class 1oth and mohan is my friend");
        // Matcher m = p.matcher("0X7a9 is in class 1oth and mohan is my friend");

        for(int i=0;i<3;i++) {
            if(m.lookingAt()) {
                System.out.println("Match: "+m.group()+" Start: "+m.start()+" End: "+m.end());
            }
        }
    }
}