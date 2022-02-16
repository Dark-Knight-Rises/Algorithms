public class App {
    public class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private int size = 0;
    Node head;

    public void addFirst(String data) {
        // adds the new node from the front of the linked list.
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty list ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("Null");
        System.out.println("the size is: " + size);
    }

    public void deleteFirst() {
        size--;
        if (head == null) {
            System.out.println("The list is already empty.");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        size--;
        if (head == null) {
            System.out.println("The list is already empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }

    public static void main(String[] args) throws Exception {
        App obj = new App();
        System.out.println("Linked list implementation. ");
        obj.addFirst("is");
        obj.addFirst("name");
        obj.addLast("Piyush");
        obj.addLast("Piyush2");
        obj.addFirst("My");
        obj.printList();
        obj.deleteFirst();
        obj.printList();
        obj.deleteLast();
        obj.printList();
    }
}
