class AThread extends Thread {
    public void run() {
        synchronized(U.class) {
            try { Thread.sleep(1000);} catch(InterruptedException e) {}
            synchronized(V.class) {
                Thread t = Thread.currentThread();
                for(int i=0;i<10;i++) {
                    System.out.println(i+" - "+t.getName());
                }
            }
        }
    }
}

class BThread extends Thread {
    public void run() {
        synchronized(V.class) {
            try { Thread.sleep(1000);} catch(InterruptedException e) {}
            synchronized(U.class) {
                Thread t = Thread.currentThread();
                for(int i=0;i<10;i++) {
                    System.out.println(i+" - "+t.getName());
                }
            }
        }
    }
}

class A {
    public static void main(String[] args) {
        AThread t1 = new AThread();
        BThread t2 = new BThread();

        t1.setName("U");
        t2.setName("V");

        t1.start();
        t2.start();
    }
}

class U { }
class V { }