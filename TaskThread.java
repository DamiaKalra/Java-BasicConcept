class   Thread2 extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
System.out.println("Thread 2 's i = "+i);
try{
    Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println(e.getMessage());
}
        }
        System.out.println("Thread is running");
    }
}
     class RunnableInterface implements Runnable {
        public void run(){
            for(int i=1;i<=5;i++){
                System.out.println("RunnableInterface 's i = "+i);
                        }
            System.out.println("Thread is running");
        }
    }
    public class TaskThread{
        public static void main(String args[]) throws InterruptedException{
            System.out.println("Main Start");
            Thread2 t1=new Thread2();
            t1.start();
            for(int i=1;i<=5;i++){
                System.out.println("Main 's i = "+i);
                Thread.sleep(1000);
                        }
            System.out.println("Main End");
            //RunnableInterface R1=new RunnableInterface();
            //Thread a1= new Thread(R1);
            //a1.start();
            System.out.println("Main End");
            
        }
    }
    
    

