class A  {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Java Batch Group");

        Thread.currentThread().getThreadGroup().list();
    }
}