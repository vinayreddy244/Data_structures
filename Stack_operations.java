import java.util.ArrayList;
public class Stack
{
    public static void main(String args[])
    {
        ArrayList<Integer> stack=new ArrayList<>();
        System.out.println(isEmpty(stack));
        push(2,stack);
        push(10,stack);
        printStack(stack);
        push(-1,stack);
        printStack(stack);

       int removedValue= pop(stack);
       printPoppedValue(removedValue);
       removedValue=pop(stack); 
       removedValue=pop(stack); 
       removedValue=pop(stack); 
       printPoppedValue(removedValue);
       printStack(stack);
       System.out.println(isEmpty(stack));
       System.out.println(top(stack));
       printStack(stack);
       

    }
    public static void printPoppedValue(int removedValue)
    {
        if(removedValue==Integer.MAX_VALUE)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Popped value is"+removedValue);
        }
    }
    public static int top(ArrayList<Integer> stack)
    {
        if(stack.size()==0)
        {
            return -1;
        }
        else
        {
            return stack.get(stack.size()-1);
        }
    }
    public static boolean isEmpty(ArrayList<Integer> stack)
    {
           return stack.size() == 0;
    }
    public static int pop(ArrayList<Integer> stack){
        if(stack.size() == 0){
            return Integer.MAX_VALUE;
        }
        return stack.remove(stack.size() - 1);
    }

    public static void push(int ele,ArrayList<Integer> stack)
    {
        stack.add(ele);
    }
    public static void printStack(ArrayList<Integer> stack)
    {
        for(int e:stack)
        {
            System.out.print(e+" ");
        }
    }

}
