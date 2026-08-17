class ARunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        
        for(int i=0;i<10;i++) {
            try {Thread.sleep(10);} catch(InterruptedException e) {}
            synchronized(A.x) {
                System.out.println(i+" - "+t.getName());
            }
        } 
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
}