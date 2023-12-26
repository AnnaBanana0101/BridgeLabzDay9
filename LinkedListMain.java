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
        list.displayList();
        System.out.println("");
    }
}
