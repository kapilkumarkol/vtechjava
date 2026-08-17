class A {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Default Thread: " + t.getName());
        // System.out.println("Thread group of Default Thread: " + t.getThreadGroup());
        System.out.println("Thread group of Default Thread: " + t.getThreadGroup().getName());
    }
}