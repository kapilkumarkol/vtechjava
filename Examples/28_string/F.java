class A {
    public static void main(String[] args) {

        String name1 = new String("umesh");
        String name2 = new String("UMESH");

        
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));
    }
}