class MyRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0;i<10;i++) {
            System.out.println(i+" - "+t.getName());
        }
    }
}

class A {
    public static void main(String[] args) {
        // new Thread(new MyRunnable(), "Golu").start();

        MyRunnable r = new MyRunnable();

        Thread t = new Thread(r, "A");

        t.start();

        Thread x = Thread.currentThread();

        for(int i=0;i<10;i++) {
            if(i==5) {
                try {
                    t.sleep(1000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i+" - "+x.getName());
        }
    }
}