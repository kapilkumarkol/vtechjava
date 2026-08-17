class AThread extends Thread {
    public void run() {        
        Thread x = Thread.currentThread();

        for(int i=0;i<100;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}

class A {
    public static void main(String[] args) throws InterruptedException {
        AThread t = new AThread();

        t.setName("A");

        t.start();

        t.join(100);

        Thread x = Thread.currentThread();

        for(int i=0;i<5;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}