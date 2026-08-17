class AThread extends Thread {
    public void run() {
        for(int i=0; i < 10; i++ ) {
            try { Thread.sleep(500);}catch(InterruptedException e) {} 
            A.x.pro(i);
        }
    }
}

class A {
    static T x = new T();
    public static void main(String[] args) {
        AThread t1 = new AThread();
        AThread t2 = new AThread();

        t1.setName("Golu");
        t2.setName("Molu");

        t1.start();
        t2.start();
    }
}

class T {
    synchronized void pro(int i) {
        Thread t = Thread.currentThread();

        System.out.println(i + " - " + t.getName());        
    } 
}