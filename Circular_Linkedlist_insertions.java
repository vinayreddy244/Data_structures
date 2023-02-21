public class Circular_Linkedlist 
{
    static class Node
    {
        int value;
        Node next;
        Node(int val)
        {
            this.value=val;        }
    }
    public static Node convertToCircularList(int arr[])
    {
        Node temp=null;
        Node start=temp;
        for(int i=0;i<arr.length;i++)
        {
            int value=arr[i];
            if(i==0)
            {
                temp=new Node(value);
                temp.next=start;
                start=temp;
            }
            else
            {
                temp.next=new Node(value);
                temp=temp.next;
                temp.next=start;
            }
        }
        return start;
    }
    public static void printList(Node start)
    {
        Node temp=start;
        {
            while(temp.next!=start)
            {
                System.out.print(temp.value+" ");
                temp=temp.next;
            }
        }
        System.out.print(temp.value);
        System.out.println();
    }
    public static Node addTostart(Node start)
    {
        Node newNode = new Node(2);
        Node temp=start;
        if (start == null) 
        {
            start = newNode;
            temp = newNode;
            temp.next = start;
        }
        else 
        {
            while(temp.next!=start)
            {
                temp=temp.next;
            }
            newNode.next = start;
            temp.next=newNode;
            start = newNode;
        }
        
        return start;
    }
    public static Node addToEnd(Node start)
    {
        Node newNode = new Node(10);
        Node temp=start;
        if (start == null) 
        {
            start = newNode;
            temp = newNode;
            temp.next = start;
        }
        else 
        {
            while(temp.next!=start)
            {
                temp=temp.next;
            }
            newNode.next = start;
            temp.next=newNode;
        }
        
        return start;

    }
     public static Node addAfter(Node start,int val)
    {
        Node newNode = new Node(30);
        Node temp=start;
        while(temp.value!=val)
        {
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return start;

    }
    public static void main(String args[])
    {
        int arr[]={2,3,5,4,22,35,3};
        Node start=convertToCircularList(arr);
        printList(start);
        start=addTostart(start);
        printList(start);
        start=addToEnd(start);
        printList(start);
        start=addAfter(start,22);
        printList(start);
    }
    
}
