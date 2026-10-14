package LinkedList;

public class Main {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
        list.insertLast(7);
        list.display();
        list.insert(9,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.delete(3));
        list.display();
        list.reverse();
        list.display();
    }
}
