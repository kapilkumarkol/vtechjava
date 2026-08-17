class A {
    public static void main(String[] args) {
        Integer w = 34;
        Integer q = w;

        System.out.println(w+" - "+q);
        System.out.println(q==w);

        w++;

        System.out.println(w+" - "+q);
        System.out.println(q==w);
    }
}