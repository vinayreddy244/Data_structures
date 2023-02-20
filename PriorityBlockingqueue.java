import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class Priority_BlockingQueue 
{
    public static void main(String[] args) 
    {
        PriorityBlockingQueue<String> myqueue=new PriorityBlockingQueue<String>();
        myqueue.add("Vinay");
        myqueue.add("Naidu");
        myqueue.add("krishna");
        printList(myqueue);
        System.out.println(myqueue.poll());
        System.out.println(myqueue.poll());

    }
    
    public static void printList(PriorityBlockingQueue<String> myqueue)
    {
        
        for(String e:myqueue)
        {
            System.out.print(e+" ");
        }
        System.out.println();

    }
}

