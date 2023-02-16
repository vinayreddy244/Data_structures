import java.util.*;
class Queue
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> queue =new ArrayList<>();
        push(1,queue);
        push(3,queue);
        push(2,queue);
        printQueue(queue);
        System.out.println("top of queue is:"+top(queue));
        pop(queue);
        printQueue(queue);
        printSize(queue);
    }
    public static void printSize(ArrayList<Integer> queue)
    {
        System.out.println("Queue size is:"+queue.size());
    }
    public static void pop(ArrayList<Integer> queue)
    {
        if(queue.size()==0)
        {
            System.out.println("Queue is Empty");
        }
        System.out.println("Removed value is :"+queue.remove(0));
 
    }
    public static int top(ArrayList<Integer> queue)
    {
        return queue.get(0);
    }
    public static void push(int value,ArrayList<Integer> queue)
    {
        queue.add(value);

    }
    public static void printQueue(ArrayList<Integer> queue)
    {
        for(int e:queue)
        {
            System.out.print(e+" ");
        }
        System.out.println();
    }

}
