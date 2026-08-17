import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("0[Xx][0-9a-f]{2,}");
        Matcher m = p.matcher("ay_20X34fc29e #0xe76!@0X*2a r0x23_+&^%0x9");

        while(m.find()) {
            System.out.println("Match: "+m.group()+" Start: "+m.start()+" End: "+m.end());
        }
    }
}