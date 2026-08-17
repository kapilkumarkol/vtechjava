class AThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0; i<10; i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}

class A {
    public static void main(String[] args) {
        AThread x = new AThread();
        AThread y = new AThread();
        
        x.setName("Golu");
        y.setName("Bholu");

        x.setPriority(Thread.MIN_PRIORITY);
        y.setPriority(Thread.MAX_PRIORITY);

        x.start();
        y.start();

        Thread t = Thread.currentThread();

        for(int i=0; i<10; i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}