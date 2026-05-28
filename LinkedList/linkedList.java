package LinkedList;

import java.util.*;

public class linkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            System.out.println(data + " is added successfully at the beginning!");
            return;
        }

        newNode.next = head;
        head = newNode;
        System.out.println(data + " is added successfully at the beginning!");
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            System.out.println(data + " is added successfully at the last!");
            return;
        }

        tail.next = newNode;
        tail = newNode;
        System.out.println(data + " is added successfully at the last!");
    }

    public void display() {
        Node temp = head;

        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);

        int i = 0;
        Node temp = head;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }

        System.out.println(data + " is added successfully at the index " + idx);
        size++;
    }

    public void DeleteFirst() {
        if (size == 0) {
            System.out.println("Linkedlist is empty");
            return;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            System.out.println(val + " has been deleted successfully from the beginning");
            return;
        }

        int val = head.data;
        head = head.next;
        size--;
        System.out.println(val + " has been deleted successfully from the beginning");
    }

    public void DeleteLast() {
        if (size == 0) {
            System.out.println("Linkedlist is empty");
            return;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            System.out.println(val + " has been deleted successfully from the last");
            return;
        }

        Node prev = head;
        while (prev.next != tail) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        System.out.println(val + " has been deleted successfully from the last");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList ll = new linkedList();
        int d, option;

        while (true) {
            System.out.println("\n-----------MENU-----------\n");
            System.out.println("1. Add a node at the Beginning");
            System.out.println("2. Add a node at the End");
            System.out.println("3. Display");
            System.out.println("4. Add a node at a particular index");
            System.out.println("5. Size");
            System.out.println("6. Delete a node from the Beginning");
            System.out.println("7. Delete a node from the End");
            System.out.println("8. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter a data to add: ");
                    d = sc.nextInt();
                    ll.addFirst(d);
                    break;

                case 2:
                    System.out.print("Enter a data to add: ");
                    d = sc.nextInt();
                    ll.addLast(d);
                    break;

                case 3:
                    ll.display();
                    break;

                case 4:
                    System.out.print("Enter an index: ");
                    int idx = sc.nextInt();
                    System.out.print("Enter data at index " + idx + ": ");
                    d = sc.nextInt();
                    ll.add(idx, d);
                    break;

                case 5:
                    System.out.println("Size: " + size);
                    break;

                case 6:
                    ll.DeleteFirst();
                    break;

                case 7:
                    ll.DeleteLast();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("INVALID INPUT | TRY AGAIN");
                    break;
            }
        }
    }
}
