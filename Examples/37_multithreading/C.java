class AThread extends Thread {
    public void run() {
        System.out.println("Hello ...");
    }
}

class A {
    public static void main(String[] args) {
        AThread x = new AThread();
        x.setName("A");

        x.start();

        ThreadGroup tg = Thread.currentThread().getThreadGroup();

        tg.list();
    }
}