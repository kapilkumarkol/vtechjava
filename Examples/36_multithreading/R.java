class AThread extends Thread {
    public void run() {
        A.x.pro();
    }
}

class BThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        synchronized(T.class) {
            for(int i=0;i<10;i++) {
                System.out.println(i+" - "+t.getName());
            }
        }
    }
}

class A {
    static T x = new T();

    public static void main(String[] args) {
        AThread t1 = new AThread();
        BThread t2 = new BThread();

        t1.setName("X");
        t2.setName("Y");

        t1.start();
        t2.start();
    }
}

class T {
    synchronized static void pro() {
        Thread t = Thread.currentThread();

        for(int i=0;i<10;i++) {
            System.out.println(i+" - "+t.getName());
        }
    }
}