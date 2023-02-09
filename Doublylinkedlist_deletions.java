public class Doublylinkedlist
{  
    public static class Node
    {  
        int data;  
        Node prev;  
        Node next;  
        public Node(int data) 
        {  
            this.data = data;  
        }  
    }  
public  void display() 
{
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + "–>");
        temp = temp.next;
    }
    System.out.println("END");
}
Node head, tail = null;   
public  void create_Node(int data) 
{  
    Node newNode = new Node(data);   
    if(head == null) 
    {  
        head = tail = newNode;  
        head.prev = null;   
        tail.next = null;  
    }  
    else 
    {    
        tail.next = newNode;    
        newNode.prev = tail;  
        tail = newNode;   
        tail.next = null;  
    }  
}
public  void deleteInitial() {  
    if(head == null) {  
        System.out.println("List is empty");  
        return;  
    }  
    else {  
        if(head != tail) 
        {  
            head = head.next;  
        }  
        else 
        {  
            head = tail = null;  
        }  
    }  
}  

public  void deleteLast() {  
    if(head == null) {  
        return;  
    }  
    else {  
        if(head != tail) {  
            tail = tail.prev;  
            tail.next = null;  
        }  
        else {  
            head = tail = null;  
        }  
    }
}
public  void delete_at_nth(int n) { 
    if(head == null) {  
        return;  
    }  
    else { 
        Node current = head;  
        int pos =n;   
        for(int i = 1; i < pos; i++){  
            current = current.next;  
        }  
        if(current == head) {  
            head = current.next;  
        }  
        else if(current == tail) {  
            tail = tail.prev;  
        }  
        else {  
            current.prev.next = current.next;  
            current.next.prev = current.prev;  
        }    
        current = null;  
    }  
}  
  public  void print() 
  {  
    Node curr = head;  
    if(head == null) {  
        System.out.println("List is empty");  
        return;  
    }
    while(curr != null) 
       {    
        System.out.print(curr.data + " ");  
        curr = curr.next;  
        }  
    System.out.println();  
    }  
public static void main(String[] args) 
{  
   Doublylinkedlist dList = new Doublylinkedlist();
   for(int i=10;i<=15;i++)
   {
    dList.create_Node(i);  
   }
   
    System.out.println("Initial Doubly Linked List: "); 
    dList.print();
    dList.deleteInitial();
    System.out.println("Doubly Linked List after Deletion from Beginning: "); 
    dList.print();  
    dList.deleteLast();
    System.out.println("Doubly Linked List after Deletion from End: "); 
    dList.print();  
    dList.delete_at_nth(2);
    System.out.println("Doubly Linked List after Deletion from Nth Position: "); 
    dList.print();          
}  
}
