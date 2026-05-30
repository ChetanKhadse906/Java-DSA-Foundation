// Operations on Doubly LinkedList
import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node prev;

    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public  class DoublyLinkedList
{
    Node head=null;
    Node tail=null;

    // 1)Inserting a node at the head of DLL
    int InsertAthead(int data)
    {
        Node newNode=new Node(data);

        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        return head.data;
    }

    // 2) Inserting a node at the tail f DLL
    int InsertAttail(int data)
    {
        Node newNode=new Node(data);

        if(head==null)
        {
            head=newNode;
            tail=newNode;

            return tail.data;
        }
        else
        {
            Node temp=head;

            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
            tail=newNode;
        }
        return tail.data;
    }

    // 3) Inserting a node at any given position in DLL

    int InsertAtgivenindex(int data, int index)
    {
        if(index<0 || index>sizeOfDLL())
        {
            return -1;
        }
        Node newNode=new Node(data);

        if(head==null)
        {
            head=newNode;
            tail=newNode;

            return head.data;
        }
        else if(index==0)
        {
            InsertAthead(data);
        }
        else if(index==sizeOfDLL())
        {
            InsertAttail(data);
        }
        else
        {
            Node temp=head;
            int i=0;

            while(i<index-1)
            {
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next.prev=newNode;

            temp.next=newNode;
            newNode.prev=temp;
        }
        return newNode.data;
    }

    // 4) Deleting a node from head in DLL
    int DeleteAthead()
    {
        int temp=0;
        if(head==null)
        {
            return -1;
        }
        else if(head.next==null)
        {
            temp=head.data;

            head=null;
            tail=null;

            return temp;
        }
        else 
        {
            temp=head.data;
            head=head.next;
            head.prev=null;
        }
        return temp;
    }

    // 5)Deleting a node from tail in DLL
    int DeleteAttail()
    {
        int value=0;
        if(head==null)
        {
            return -1;
        }
        else if(head.next==null)
        {
            value=DeleteAthead();
        }
        else
        {
            value=tail.data;

            tail=tail.prev;
            tail.next=null;
        }
        return value;
    }
    
    // 6)Deleting a node at any given index from DLL
    int DeleteAtindex(int index)
    {
        int value=0;
        if(index<0 || index>=sizeOfDLL())
        {
            return 0;
        }

        if(head==null)
        {
            return -1;
        }

        else if(index==0)
        {
            value=DeleteAthead();
        }
        else if(index==sizeOfDLL()-1)
        {
            value=DeleteAttail();
        }
        else 
        {
            Node temp=head;

            int i=0;
            while(i<index-1)
            {
                temp=temp.next;
                i++;
            }
            value=temp.next.data;
            // temp.next.next.prev=temp;
            // temp.next=temp.next.next;

            temp.next=temp.next.next;
            temp.next.prev=temp;
            
        }

        return value;
    }

    int sizeOfDLL()
    {
        Node temp=head;
        int count=0;

        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }


    void displayDLL()
    {
        if(head==null)
        {
            System.out.println("DLL is empty, has no nodes");
            return;
        }
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        DoublyLinkedList DLL=new DoublyLinkedList();
        // System.out.println(DLL.head.data + " " + DLL.tail.data);
        // System.out.println(DLL.head.prev);
        // System.out.println(DLL.head.next);

        Scanner sc=new Scanner(System.in);
       
        while(true)
        {
        System.out.println("1. Insert a node at head in DLL:");
        System.out.println("2. Insert a node at tail in DLL:   ");
        System.out.println("3. Insert a node at any given positon in DLL: ");
        System.out.println("4. Delete a node at head in DLLL: ");
        System.out.println("5. Delete anode at tail in DLL: ");
        System.out.println("6. Delete a node at any given index in DLL: ");
        System.out.println("7. Display DLL");
        System.out.println("8. Size or nodes in DLL: ");
        System.out.println("9.Exit");

        System.out.println("Enter the choice to perform operation on Doubly LinkedList: ");
        int choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter the data to insert at head: ");
                int data=sc.nextInt();

                int value=DLL.InsertAthead(data);
                System.out.println("Node inserted with data " + value + " in DLL ");

            }
            else if(choice==2)
            {
                System.out.println("Enter the data to insert at tail: ");
                int data=sc.nextInt();

                int value=DLL.InsertAttail(data);
                System.out.println("Node inserted at tail with data " + value + " in DLL ");
            }

            else if(choice==3)
            {
                System.out.println("Enter the data to insert: ");
                int data=sc.nextInt();

                System.out.println("Enter the index: ");
                int index=sc.nextInt();

                int value=DLL.InsertAtgivenindex(data, index);

                if(value==-1)
                {
                    System.out.println("Invalid Index");
                    
                }
                else
                {
                     System.out.println("Node inserted at index " + index + " with data " + value + " in DLL ");
                }

            }
            else if(choice==4)
            {
                int value=DLL.DeleteAthead();

                if(value==-1)
                {
                    System.out.println("Deletion not possible DLL do not have any nodes");
                }

                System.out.println("Node deleted at head of DLL with data " + value);
            }
            else if(choice==5)
            {
                int value=DLL.DeleteAttail();

                if(value==-1)
                {
                    System.out.println("Deletion not possible DLL do not have any nodes");
                }
                else
                {
                    System.out.println("Node deleted at tail of DLL with data " + value );
                }
            }
            else if(choice==6)
            {
                System.out.println("Enter the index from to delete node: ");
                int index=sc.nextInt();

                int value=DLL.DeleteAtindex(index);

                if(value==0)
                {
                    System.out.println("Invalid Index");
                }
                else if(value==-1)
                {
                    System.out.println("Deletion not possible DLL do not have any nodes");
                }
                else
                {
                    System.out.println("Node deleted from given index with data " + value);
                }
            }
            else if(choice==7)
            {
                DLL.displayDLL();
            }
            else if(choice==8)
            {
                int size=DLL.sizeOfDLL();
                System.out.println("Size of DLL" + size);
            }
            else
            {
                System.out.println("Exit");
                return;
            }
        }
    }

}
