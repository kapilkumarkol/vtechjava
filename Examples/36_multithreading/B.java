class AThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0;i<5;i++) {

            System.out.println(i+" - "+t.getName()+" is going to withdraw ...");
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }

            A.ac.balance -= 10;
            System.out.println(i+" - "+t.getName()+"'s withdrawl completed balance is: "+ A.ac.balance);
        }
    }
}

class A {
    static Account ac = new Account();
    public static void main(String[] args) {
        AThread x = new AThread(); 
        AThread y = new AThread();
        
        x.setName("Mohan");
        y.setName("Ganesh");

        x.start();
        y.start();
    }
}

class Account {
    int balance = 50;
}