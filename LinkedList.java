
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
        if(this.head==null)
        {
            head = newNode;
        }
        else
        {
            Node<T> temp = head.next;

            head.next = newNode;
            newNode.next = temp;
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