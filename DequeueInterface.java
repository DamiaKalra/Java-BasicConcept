import java.util.*;
public class DequeueInterface {
    public static void main(String args[]){
    Deque<String> deque=new ArrayDeque<String>();
    deque.offer("karan");
    deque.offer("damia");
    deque.add("mishti");
    deque.offerFirst("tania");
    System.out.println("After offer first traversal");
    for(String s:deque){
        System.out.println(s);
        }
        deque.pollLast();
        System.out.println("After pollLast() traversal");
        for(String s:deque){
         System.out.println(s);
        }
        }
}
