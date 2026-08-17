class A {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("JAVA");

        tg.setMaxPriority(7);
        System.out.println(tg.getMaxPriority());

        ThreadGroup ntg = new ThreadGroup(tg, "Threading");

        System.out.println(tg.getMaxPriority());
    }
}