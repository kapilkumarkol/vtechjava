class A {
    public static void main(String[] args) {
        String x = "omji";
        
        String a = "om";
        String b = "ji";

        // String c = a + b;   //false
        String c = a.concat(b); //false

        System.out.println(c == x);
    }
}