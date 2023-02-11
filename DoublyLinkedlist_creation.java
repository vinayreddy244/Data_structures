public class Doubly_Linked_list
 { 
      
        class Node
        {  
            int data;  
            Node previous;  
            Node next;  
      
            public Node(int data) 
            {  
                this.data = data;  
            }  
        }   
        Node head, tail = null;  
        public void createNode(int data)
         {  
            Node newNode = new Node(data);  
            if(head == null) 
            {  
                head = tail = newNode;  
                head.previous = null;    
                tail.next = null;  
            }  
            else {   
                tail.next = newNode;  
                newNode.previous = tail;  
                tail = newNode;    
                tail.next = null;  
            }  
        }  
       
        public void display() 
        {  
            Node current = head;  
            if(head == null) {  
                System.out.println("List is empty");  
                return;  
            }  
            System.out.println("Nodes of doubly linked list: ");  
            while(current != null) 
            {    
      
                System.out.print(current.data + " ");  
                current = current.next;  
            }  
        }  
      
        public static void main(String[] args)
         {  
      
            Doubly_Linked_list dList = new Doubly_Linked_list();    
           for(int i=10;i<=15;i++)
           {
            dList.createNode(i);  
           }
       
            dList.display();  
        }  
}
