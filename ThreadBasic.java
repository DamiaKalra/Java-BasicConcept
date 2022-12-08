public class ThreadBasic extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
        System.out.println("Main Start");
        ThreadBasic t1=new ThreadBasic();
        t1.start();
        System.out.println("Main End");
    }
}

