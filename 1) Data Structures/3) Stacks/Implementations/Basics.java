import java.util.Stack;
import java.util.Scanner;

public class Basics
{
    // Q.9 Pop At Bottom Using Recursion
    static void popAtBottom(Stack<Integer> st)
    {
        if(st.size()==1)
        {
            st.pop();
            return;
        }

        int top=st.pop();

        popAtBottom(st);

        st.push(top);
    }


    // Q.8 Reverse Stack Recursively
    // static void ReverseStack(Stack<Integer> st)
    // {
    //     if(st.size()==1)  return;
        
    //     int top=st.pop();

    //     ReverseStack(st);
    //     pushAtBottom(st, top);
    // }

    // Q. 7 Push at bottom using Recursion
    // static void pushAtBottom(Stack<Integer> st, int value)
    // {
    //     if(st.size()==0)
    //     {
    //         st.push(value);
    //         return;
    //     }
    //     int top=st.pop();

    //     pushAtBottom(st, value);
    //     st.push(top);
    // }

    
    // Q.6 Print stack using Recursion
    // (i) In same Order
    // static void displayElement(Stack<Integer> st)
    // {
    //     if(st.size()==0) return;

    //     int top=st.pop();
    //     displayElement(st);

    //     System.out.print(top +" ");
    //     st.push(top);
    // }
    // (ii) In Reverse Order
    // static void displayReverse(Stack<Integer> st)
    // {
    //     if(st.size()==0) return;

    //     int top=st.pop();

    //     System.out.print(top + " ");
    //     displayReverse(st);
    //     st.push(top);
    // }
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();

        // 1) Taking Input in Stack
        // Scanner sc=new Scanner(System.in);

        // System.out.println("Enter the number of elements you want to inser into Stack: ");
        // int n=sc.nextInt();

        // System.out.println("Enter each elements: ");
        // for(int i=1;i<=n;i++)
        // {
        //     int x=sc.nextInt();
        //     st.push(x);
        // }
        // System.out.println(st);

        // 2) Stack Operations
        // (i) st.push
        // st.push(10);
        // System.out.println(st);

        // (ii) st.pop()
        // st.pop();
        // System.out.println(st);
        
        // (iii) st.peek()
        // System.out.println(st.peek());
        // System.out.println();

        // (iv) st.size()
        // System.out.println(st.size());

        // (v) st.isEmpty()
        // System.out.println(st.isEmpty());

        // 3) Questions
        // Q1. Stack has 5 elements access or get 2st inserted element 
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Original Stack: " + st);

        // while(st.size()>2)
        // {
        //     st.pop();
        // }
        // System.out.println(st.peek());
        // System.out.println(st);

        // Q2. Copy contenets of one stack into another stack in same order
        // Stack<Integer> result=new Stack<>();
        // Stack<Integer> temp=new Stack<>();

        // while(st.size()>0)
        // {
        //     int x=st.pop();
        //     temp.push(x);
        // }
        // System.out.println(temp);

        // while(temp.size()>0)
        // {
        //     int x=temp.pop();
        //     result.push(x);
        // }
        // System.out.println(result);

        // System.out.println();
        // System.out.println(st);
        // System.out.println(temp);

        // Q3. Reverse elements within same stack
        // Stack<Integer> temp1=new Stack<>();
        // Stack<Integer> temp2=new Stack<>();
        // while(st.size()>0)
        // {
        //     int x=st.pop();
        //     temp1.push(x);
        // }

        // while(temp1.size()>0)
        // {
        //     int x=temp1.pop();
        //     temp2.push(x);
        // }

        // while(temp2.size()>0)
        // {
        //     int x=temp2.pop();
        //     st.push(x);
        // }
        // System.out.println("Reverse Stack Elements: " + st);

        // System.out.println();
        // System.out.println(temp1);
        // System.out.println(temp2);

        // Q.4 Insert at bottom/ any index in Stack by maintaining all the elements
        // Stack<Integer> temp=new Stack<>();
        // Insert at bottom--> index: 0, element: 100
        // while(st.size()>0)
        // {
        //     temp.push(st.pop());
        // }
        // st.push(100);

        // while(temp.size()>0)
        // {
        //     st.push(temp.pop());
        // }
        // System.out.println("Stack: " + st);

        // Insert index:2, element: 100
        // while(st.size()>=2)
        // {
        //     temp.push(st.pop());
        // }
        // st.push(100);

        // while(temp.size()>0)
        // {
        //     st.push(temp.pop());
        // }
        // System.out.println(st);

        // Q.5 Prnting stack elements using another stack & Array
        // (i) Using Stack
        // Stack<Integer> temp=new Stack<>();

        // while(st.size()>0)
        // {
        //     temp.push(st.pop());
        // }

        // while(temp.size()>0)
        // {
        //     int x=temp.pop();

        //     System.out.print(x + " ");

        //     st.push(x);
        // }

        // (ii) Using Array
        // int n=st.size();
        // int[] arr=new int[n];
        
        // int index=n;
        // while(st.size()>0)
        // {
        //     int x=st.pop();

        //     arr[index-1]=x;
        //     index--;
        // }

        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i] + " ");
        //     st.push(arr[i]);
        // }

        // Q.6 Print stack element using Recursion
        // (i) In same Order
        // displayElement(st);

        // System.out.println();

        // (ii) In Reverse Order
        // displayReverse(st);

        // Q.7 Push at bottom using Recursion
        // pushAtBottom(st, 7);
        // System.out.println("Stack: " + st);

        // Q.8 Reverse Stack Recursively
        // ReverseStack(st);
        // System.out.println("Reversed Stack: " + st);

        // Q.9 Pop at bottom using Recursion and Normal
        //(i) Using normal
        // Stack<Integer> temp=new Stack<>();

        // while(st.size()>1)
        // {
        //     int x=st.pop();
        //     temp.push(x);
        // }

        // st.pop();

        // while(temp.size()!=0)
        // {
        //     st.push(temp.pop());
        // }

        // System.out.println("Stack: " + st);

        //(ii) Using Recursion
        popAtBottom(st);
        System.out.println(st);
    }
}