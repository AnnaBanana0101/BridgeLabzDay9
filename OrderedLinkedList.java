
public class OrderedLinkedList<T extends Comparable<T>> extends LinkedList<T>{

    public void addNode(T data)
    {
        Node<T> newNode = new Node<>(data);

        if(head==null || data.compareTo(head.data)<=0)
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> prev = head;
        Node<T> curr = head.next;

        while(curr!=null && data.compareTo(curr.data)>0)
        {
            prev = curr;
            curr = curr.next;
        }
        prev.next = newNode;
        newNode.next = curr;

    }

    
}