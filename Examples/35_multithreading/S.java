class AThread extends Thread {
    public void run() {
        BThread t = new BThread();

        t.setName("B");

        t.start();

        try {
            t.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        Thread x = Thread.currentThread();
        for(int i=0;i<5;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}

class BThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i=0;i<5;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}

class A {
    public static void main(String[] args) throws InterruptedException {
        AThread t = new AThread();

        t.setName("A");

        t.start();

        t.join();

        Thread x = Thread.currentThread();
        for(int i=0;i<5;i++) {            
            System.out.println(i + " - " + x.getName());
        }
    }
}