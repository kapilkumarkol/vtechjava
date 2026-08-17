class MyThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        System.out.println(t.getName()+" ++++");
    }
}

class A {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.setName("Golu");
        
        t.run();
        
        // t.start();
    }
}