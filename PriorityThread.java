public class PriorityThread extends Thread {
    public void run()
    {
        System.out.println("Nmae"+this.getName()+"\nPriority"+this.getPriority());
    }
    public static void main(String[] args){
        PriorityThread t1=new PriorityThread();
        PriorityThread t2=new PriorityThread();
        t1.setPriority(5);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
