class AThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        for(int i=0;i<10;i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}

class A {
    public static void main(String[] args) {
        AThread t = new AThread();

        t.setName("A");

        t.start();      

        Thread x = Thread.currentThread();
        for(int i=0;i<10;i++) {
            if(i == 5) {
                try {
                    t.join();
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i + " - " + x.getName());
        }
    }
}