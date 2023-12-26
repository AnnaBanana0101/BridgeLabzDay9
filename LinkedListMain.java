public class LinkedListMain {
    public static void main(String[] args) throws Exception {
       
        LinkedList<Integer> list = new LinkedList<>();

        list.addNodeAtBeginning(70);
        
        list.addNodeAtBeginning(30);
       
        list.addNodeAtBeginning(56);
       
        System.out.println("The list: ");
        list.displayList();
    }
}
