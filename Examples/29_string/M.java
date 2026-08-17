class A {
    public static void main(String[] args) {
        String a = "om";
        String b = a;
        
        a = "mohan";
        
        String c = "om";

        System.out.println(b==c);
    }
}