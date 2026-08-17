class AThread extends Thread {
    public void run() {
        for(int i=0;i<1000;i++) {

        }
    }
}

class A {
    public static void main(String[] args) throws InterruptedException {
        AThread x = new AThread();
        x.setName("A");

        x.start();

        ThreadGroup tg = Thread.currentThread().getThreadGroup();

        tg.list();

        Thread.sleep(1000);

        tg.list();
    }
}