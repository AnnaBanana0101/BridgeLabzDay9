
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
}