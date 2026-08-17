class MyRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        try {
            A.t.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Kaise Ho Golu");
    }
}

class A {
    static Thread t;
    public static void main(String[] args) throws InterruptedException {
        t = Thread.currentThread();
        
        Thread x = new Thread(new MyRunnable(), "Golu");
        x.start();

        x.join();

        System.out.println("Kaise Ho main");
    }
}