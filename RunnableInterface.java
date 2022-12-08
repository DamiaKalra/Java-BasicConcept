public class RunnableInterface implements Runnable {
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
        System.out.println("Main Start");
        RunnableInterface R1=new RunnableInterface();
        Thread t1= new Thread(R1);
        t1.start();
        System.out.println("Main End");
    }
}
