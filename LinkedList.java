
public class LinkedList<T> {

    Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void addNodeAtBeginning(T data){
        Node<T> newNode = new Node(data);

        if(head==null)
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    public void displayList()
    {
        Node <T> temp = head;

        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public void appendNode(T data){

        Node<T> newNode = new Node<>(data);

        if(this.head==null)
        {
            head = newNode;
        }
        else
        {
            Node<T> temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public int size()
    {
        int count=0;

        Node<T> temp =head;

        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void insertNodeAtPosition(int data, int position)
    {        
        if(position<0 || position>size())
        {
            System.out.println("Invalid");
            return;
        }
        Node<T> newNode = new Node(data);

        Node<T> temp=head;
        
        if(position==0)
        {
            newNode.next = head;
            head = newNode;
        }

        for(int i = 0; i<position-1; i++)
        {
            temp = temp.next;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtBeginning()
    {
        if(head==null)
            return;
        head = head.next;
    }

    public void popLast()
    {
        if(head==null)
            return;
        
        Node<T> temp =head;

        while(temp.next.next!=null)
        {
            temp = temp.next;
        }

        temp.next = null;
    }

    public int search(T data)
    {
        if(head == null)
        {
            System.out.println("Empty list");
            return 0;
        }

        Node<T> temp = head;

        for(int i=0; i<size(); i++)
        {
            if(temp.data.equals(data))
                return i;
            temp=temp.next;
        }
        if(temp == null)
        {
            System.out.println("Element not found");
        }
        return 0;
    }

}