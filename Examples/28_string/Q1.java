// String class is final
// and String object is immutable

class A {
    public static void main(String[] args) {
        String x = "vikromodityo";
        String str = "vikramaditya";

        String tmp = str.replace('a', 'o');

        System.out.println(tmp);
        System.out.println(str);
        System.out.println(tmp==x);
    }
}