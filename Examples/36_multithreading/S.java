class ARunnable implements Runnable {
    public void run() {
        A.x.pro();
    }
}

class BRunnable implements Runnable {
    public void run() {
        A.y.info();
    }
}

class A {
    static T x = new T();
    static U y = new U();
    public static void main(String[] args) {
        Thread t1 = new Thread(new ARunnable(), "A");
        Thread t2 = new Thread(new BRunnable(), "B");

        t1.start();
        t2.start();
    }
}

class T {
    synchronized void pro() {
        Thread t = Thread.currentThread();

        try { Thread.sleep(1000);} catch(InterruptedException e) {}
        A.y.info();

        System.out.println(t.getName());
    }
}

class U {
    synchronized void info() {
        Thread t = Thread.currentThread();

        try { Thread.sleep(1000);} catch(InterruptedException e) {}
        A.x.pro();

        System.out.println(t.getName());
    }
}