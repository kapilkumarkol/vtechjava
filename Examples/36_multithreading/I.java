class AThread extends Thread {
    public void run() {
        A.x.pro();
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
    synchronized void pro() {
        Thread t = Thread.currentThread();

        for(int i=0; i < 10; i++ ) {
            try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace();}
            System.out.println(i + " - " + t.getName());
        }
    } 
}