class AThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0;i<100;i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}

class A {
    public static void main(String[] args) {
        AThread x = new AThread();
        x.setName("A");
        x.setDaemon(true);

        x.start();

        Thread t = Thread.currentThread();

        for(int i=0;i<5;i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}