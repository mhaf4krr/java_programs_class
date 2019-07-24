class BankAccount {
    public int balance = 100;
}

public class CProblem implements Runnable{
    private BankAccount account = new BankAccount();

    public void run(){
        for(int x = 0 ; x<10 ;x++){
            makeWithdrawl(10);
            if(account.balance <0){
                System.out.println("OverDrawn");
            }
        }
    }

    private void makeWithdrawl(int amount){
        if(account.balance >= amount){
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");

            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            }
            catch (Exception ex){

            }
            System.out.println(Thread.currentThread().getName() + " woke up");
            account.balance = account.balance - amount;
            System.out.println(Thread.currentThread().getName() + " Completes withdrawl");
        }

        else {
            System.out.println(Thread.currentThread().getName() + " Sorry Not Enough");
        }
    }

    public static void main(String[] args){
        Thread one = new Thread(new CProblem());
        one.setName("Jan");
        Thread two = new Thread(new CProblem());
        two.setName("Ubaid");
        one.start();
        two.start();
    }
}