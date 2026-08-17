class A  {
    public static void main(String[] args) {
        ThreadGroup systg = Thread.currentThread().getThreadGroup().getParent();
        
        ThreadGroup tg = new ThreadGroup(systg, "Java Batch Group");

        systg.list();
    }
}