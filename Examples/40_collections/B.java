class A {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(23);
        Integer j = Integer.valueOf(23);
        Integer k = Integer.valueOf(32);

        // System.out.println(k.compareTo(i));
        // System.out.println(i.compareTo(k));
        System.out.println(i.compareTo(j));
    }
}