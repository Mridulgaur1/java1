package New;

import java.util.Scanner;
class Node
{
    int rollno;
    Node next;
}
public class SinglyLinkedList
{
    Node START;
    SinglyLinkedList()
    {
        START = null;
    }
    void insert()
    {
        System.out.println("enter your rollno.");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node nn = new Node();
        nn.rollno =data;
        nn.next=null;
        if(START==null)
        {
            START=nn;
        }
        else
        {
            Node current=START;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=nn;
        }
       // System.out.println("insert is working");
    }
    void delete()
    {
        System.out.println("delete is working");

    }
    void traverse()
    {
        if(START==null)
        {
            System.out.println("list is empty");

        }
        else
        {
            System.out.println("-----singly list elements----");
            Node current;
            for(current=START;current!=null;current=current.next)
            {
                System.out.println(" "+current.rollno);

            }
        }
        //System.out.println("traverse is working");

    }

    public static void main(String[] args)
    {
        SinglyLinkedList obj = new SinglyLinkedList();
        while(true)
        {
            System.out.println("press one for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for exit");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice");

            }
        }
    }
}
