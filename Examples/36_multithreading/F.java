class AThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0;i<5;i++) {
            System.out.println(i+" - "+t.getName()+" is going to withdraw ...");
            A.ac.withdraw(10);
            System.out.println(i+" - "+t.getName()+"'s withdrawl completed balance is: "+ A.ac.getBalance());
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
    private int balance = 50;
    String acNum = "123456";
    String acType = "Savings";

    String getAcNum() {
        return acNum; 
    }

    String getAcType() {
        return acType;
    }

    synchronized void withdraw(int amt) {
        if(balance >= amt) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
    
            balance -= amt;
        }
    }

    synchronized int getBalance() {
        return balance;
    }
}