public class Doubly_linkedlist 
{
    Node head;
    class Node 
    {
        int data;
        Node next, prev;

        Node(int x) 
        {
            data = x;
            next = null;
            prev = null;
        }
    }

    public void insert_at_Beginning(int data) 
    {
        Node newNode = new Node(data);

        newNode.next = head;
        newNode.prev = null;
        if (head != null)
            head.prev = newNode;
        head = newNode;
    }

    public void insert_at_End(int data) 
    {
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            newNode.prev = null;
            return;
        }

        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newNode;
        newNode.prev = last;

    }

    public void insertAfterPosition(int n, int data)
     {
        int len = getLength(head);
        if (n == 0) {
            insert_at_Beginning(data);
            return;
        }
        if (n == len) {
            insert_at_End(data);
            return;
        }


        if (n < 1 || len < n) System.out.println("Invalid position");

        else {
            Node newNode = new Node(data);

            newNode.next = null;
            newNode.prev = null;

            Node nthNode = head;
            while (--n > 0) {
                nthNode = nthNode.next;
            }

            Node nextNode = nthNode.next; 

            nextNode.prev = newNode;
            newNode.next = nextNode;
            newNode.prev = nthNode;
            nthNode.next = newNode;
        }
    }

    public void printList()
     {
        Node node = head;
        Node end = null;

        System.out.print("\nIn forward direction: ");
        while (node != null)
         {
            System.out.print(node.data + " ");
            end = node;
            node = node.next;
        }
        System.out.print("\nIn backward direction: ");

        while (end != null)
         {
            System.out.print(end.data + " ");
            end = end.prev;
        }
        System.out.println();
    }
    public int getLength(Node node) 
    {
        int size = 0;
        while (node != null) 
        {
            node = node.next;
            size++;
        }
        return size;
    }

    public static void main(String args[])
    {
        Doubly_linkedlist doublylist = new Doubly_linkedlist();

       for(int i=3;i<=6;i++)
       {
        doublylist.insert_at_Beginning(i);

       }
       System.out.println("After inserting at beginning");
        doublylist.printList();

        for(int i=4;i<=8;i++)
       {
        doublylist.insert_at_End(i);
       }
       System.out.println("After inserting at End");

        doublylist.printList();
        System.out.println("After inserting at given position");

        doublylist.insertAfterPosition(4,5);

        doublylist.printList();
    }
}
