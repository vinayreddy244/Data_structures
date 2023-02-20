import java.util.*;
import java.util.Comparator;
public class Priority_Queue {
    static class Mycomparator implements Comparator<Integer>
    {
        public int compare(Integer o1,Integer o2)
        {
            int val1=o1;
            int val2=o2;
            if(val2>=val1)
            {
                return 1;
            }
            return -1;
        }
    }
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> myqueue=new PriorityQueue<>(new Mycomparator());
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
