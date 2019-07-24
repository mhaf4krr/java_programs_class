class MyTheadJob implements Runnable{
   
   
    public void run(){
        System.out.println("Hello from Thread");
    }
}

public class T1 {
    T1(){
        System.out.println("Hello from Main");
        Thread thread = new Thread(new MyTheadJob());
        thread.start();
    }

    public static void main(String[] args){
        new T1();
    }
}