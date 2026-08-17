class G extends Thread {
    public void run() {
        System.out.println("1");
        try { Thread.sleep(5000); } catch(InterruptedException e) { e.printStackTrace(); }
        System.out.println("2");
    }
}

class A {
    public static void main(String[] args) {
        G g = new G();
        g.start();
        g.interrupt();

        System.out.println(Thread.currentThread().getName());
    }
}