package LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.display();

        list.insertHead(10);
        list.insertHead(20);
        list.insertHead(30);

        list.display();

        list.insertTail(40);
        list.insertTail(50);

        list.display();

        list.removeHead();
        list.display();

        list.removeTail();
        list.display();

        list.removeTail();
        list.display();

        list.removeHead();
        list.display();

        list.removeTail();
        list.display();
    }
}
