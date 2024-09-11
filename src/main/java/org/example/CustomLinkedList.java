package org.example;

import java.util.List;

class CustomLinkedList {
    public Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public int get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) throw new IndexOutOfBoundsException();
            current = current.next;
        }
        return current.data;
    }

    public void remove(int index) {
        if (head == null) throw new IndexOutOfBoundsException();
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.next == null) throw new IndexOutOfBoundsException();
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) return true;
            current = current.next;
        }
        return false;
    }

    public void addAll(List<Integer> elements) {
        for (int element : elements) {
            add(element);
        }
    }

    public void merge(CustomLinkedList other) {
        if (other == null || other.head == null) return; // Если другой список пуст, ничего не делаем

        Node current = other.head;
        while (current != null) {
            this.add(current.data); // Добавляем элементы другого списка в текущий
            current = current.next;
        }
    }

}
