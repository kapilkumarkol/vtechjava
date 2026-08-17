class A {
    public static void main(String[] args) {
        String i = new String("mohan");
        String j = new String("mohan");
        String k = new String("mihan");

        System.out.println(k.compareTo(i));
        System.out.println(i.compareTo(k));
        System.out.println(i.compareTo(j));
    }
}