import java.util.*;
import java.util.Comparator;
public class Priority_Queue {
    public static void main(String[] args) 
    {
       

        PriorityQueue<Integer> myqueue=new PriorityQueue<>();
        myqueue.add(10);
        myqueue.add(20);
        myqueue.add(30);
        printList(myqueue);
        System.out.println(myqueue.poll());
        System.out.println(myqueue.poll()); 


        
    }
    public static void printList(PriorityQueue<Integer> myqueue)
    {
        for(int e:myqueue)
        {
            System.out.print(e+" ");
        }
        System.out.println();

    }
    
}
