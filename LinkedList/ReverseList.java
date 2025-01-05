package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{

    private Node head;

    public LinkedList(){
        this.head=null;
    }
    
    public void addNode (int data){

        Node newNode=new Node(data);

        if (head==null){
            head=newNode;
        }
        else{
            Node curr=head;
            
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }

    }

    public void display(){
        if(head==null){
            System.out.println("The list is empty!!");
            return;
        }

        Node curr=head;

        while(curr!=null){
            System.out.print(curr.data+ "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public Node reverseList(Node head){
        Node prev = null;
        Node current = head;

        while (current!=null){
            Node nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }

        return prev;
    }

    public void reverse() {
        head = reverseList(head);
    }

    
}

public class ReverseList{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);

        System.out.print("Original Linked List : ");
        list.display();

        list.reverse();

        System.out.print("Reversed Linked List : ");
        list.display();
    }
}