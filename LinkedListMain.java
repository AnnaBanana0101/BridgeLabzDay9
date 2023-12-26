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

    }
}
