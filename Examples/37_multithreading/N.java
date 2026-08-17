class A {
    public static void main(String[] args) {
        ThreadGroup tg = Thread.currentThread().getThreadGroup();

        System.out.println(tg.getMaxPriority());
    }
}