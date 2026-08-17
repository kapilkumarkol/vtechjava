class MyThread extends Thread {
    public void run() {
        Thread y = Thread.currentThread();

        // System.out.println(y.getName());
        System.out.println(y);
    }
}


class A {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        // System.out.println(t.getName());
        System.out.println(t);

        MyThread x = new MyThread();

        x.start();
    }
}