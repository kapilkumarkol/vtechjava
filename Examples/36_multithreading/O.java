class ARunnable implements Runnable {
    public void run() {
        A.x.pro();
    }
}

class A {
    static T x = new T();
    public static void main(String[] args) {
        ARunnable r = new ARunnable();
        
        Thread t1 = new Thread(r, "A");
        Thread t2 = new Thread(r, "B");

        t1.start();
        t2.start();
    }
}

class T {
    /*synchronized*/ void pro() {
        Thread t = Thread.currentThread();
        synchronized(this) {
            for(int i=0;i<10;i++) {
                System.out.println(i+" - "+t.getName());
            }
        }
    }
}