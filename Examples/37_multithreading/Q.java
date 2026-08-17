class ARunnable implements Runnable {
    public void run() {
        // System.out.println("Hello");
        for(int i=0;i<1000;i++) {

        }
    }
}

class A {
    public static void main(String[] args) {
        ThreadGroup ntg = new ThreadGroup("QUAD"); 

        ARunnable r = new ARunnable();

        Thread t1 = new Thread(ntg, r, "America");
        Thread t2 = new Thread(ntg, r, "Bharat");

        t1.setPriority(9);
        t2.setPriority(7);

        ntg.setMaxPriority(5);

        Thread t3 = new Thread(ntg, r, "Australia");
        Thread t4 = new Thread(ntg, r, "Japan");

        t3.setPriority(8);
        t4.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        ntg.list();
    }
}