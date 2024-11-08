package LinkedList;

public class SinglyLinkedList {
    Node head;

    // Method to insert a new node at the head of the list
    public void insertHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head; // Link the new node to the current head
        head = newNode; // Update head to the new node
    }

    // Method to insert a new node at the tail of the list
    public void insertTail(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode; // If the list is empty, set head to the new node
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newNode; // Link the new node at the end
        }
    }

    // Method to remove the head node
    public void removeHead() {
        if (head == null) {
            System.out.println("Empty list, nothing to remove.");
        } else {
            System.out.println("Head element removed: " + head.value);
            head = head.next; // Move head to the next node
        }
    }

    // Method to remove the tail node
    public void removeTail() {
        if (head == null) {
            System.out.println("Empty list, nothing to remove.");
            return;
        }

        if (head.next == null) {
            System.out.println("Removing last element: " + head.value);
            head = null; // If there's only one node, set head to null
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next; // Traverse to the second last node
        }
        System.out.println("Removing last element: " + current.next.value);
        current.next = null; // Remove the last node
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("Empty list.");
            return;
        }

        while (current != null) {
            System.out.print(current.value + " -> "); // Print current node's value
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // End of the list
    }
}