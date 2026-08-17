class AThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " Thread is" + (t.isDaemon() ? "" : " not") + " a Daemon Thread...");
    
        BThread x = new BThread();
        x.setName("B");
        x.start();
    }
}

class BThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " Thread is" + (t.isDaemon() ? "" : " not") + " a Daemon Thread...");    
    }
}

class A {
    public static void main(String[] args) throws InterruptedException {
        AThread x = new AThread();
        x.setName("A");
        x.setDaemon(true);

        x.start();

        Thread.sleep(1000);
    }
}