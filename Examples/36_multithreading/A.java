class ARunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0;i<20;i++) {
            if(i>15) {
                System.out.println("yield method called "+ t.getName());
                Thread.yield();
            }

            System.out.println(i + " - " + t.getName());
        }
    }
}

class A {
    public static void main(String[] args) {
        Thread x = new Thread(new ARunnable(), "Golu");
        x.start();

        Thread t = Thread.currentThread();
        for(int i=0;i<50;i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}