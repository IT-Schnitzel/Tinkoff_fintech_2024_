package org.example;

public class ListPrint {
    public static void printList(CustomLinkedList list) {
        Node current = list.head;
        StringBuilder sb = new StringBuilder("Current List: ");
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        System.out.println(sb.toString());
    }
}
