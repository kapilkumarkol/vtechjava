class MyRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println(x.getName());
    }
}

class A {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();

        Thread t = new Thread(r);
        t.setName("raj");
        t.start();

        System.out.println(Thread.currentThread().getName());
    }
}