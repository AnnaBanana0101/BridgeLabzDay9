public class LinkedListMain {
    public static void main(String[] args) throws Exception {
       
        LinkedList<Integer> list = new LinkedList<>();

        list.addNodeAtBeginning(70);
        
        list.addNodeAtBeginning(30);
       
        list.addNodeAtBeginning(56);
       
        System.out.println("The list with nodes added at the beginning: ");
        list.displayList();
        System.out.println("");

        LinkedList<Integer> list1 = new LinkedList<>();

        list1.appendNode(56);
        list1.appendNode(30);
        list1.appendNode(70);

        System.out.println("The list with nodes appended at the end: ");
        list1.displayList();
        System.out.println("");

        LinkedList<Integer> list2 = new LinkedList<>();

        list2.addNodeAtBeginning(56);
        list2.appendNode(70);
        list2.insertNodeAtPosition(30,1);
        

        System.out.println("The list with node inserted at position1: ");
        list2.displayList();
        System.out.println("");

        System.out.println("The list with head popped: ");
        list2.deleteAtBeginning();
        list2.displayList();
        System.out.println("");

        System.out.println("The list with tail popped: ");
        list1.popLast();;
        list1.displayList();
        System.out.println("");

        System.out.println("Find element 30 in list: ");
        int position = list.search(30);
        System.out.println("Position: "+ position);
        System.out.println("");

        System.out.println("Insert element 40 after 30 in list: ");
        list.insertAfterNode(40,70);
        list.displayList();
        System.out.println("");

        System.out.println("Delete element 40 in list: ");
        int size=list.deleteNodeWithValue(40);
        list.displayList();
        System.out.println("");
        System.out.println("Size: " + size);
        System.out.println("");

        System.out.println("Ordered Linked list:");
        OrderedLinkedList<Integer> orderedList = new OrderedLinkedList<>();
        orderedList.addNode(70);
        orderedList.addNode(30);
        orderedList.addNode(56);
        orderedList.displayList();
        System.out.println("");

    }
}
