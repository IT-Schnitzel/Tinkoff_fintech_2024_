package org.example;
import java.util.stream.Stream;

public class StreamToLinkedList {

    public static CustomLinkedList convert(Stream<Integer> stream) {
        CustomLinkedList list = new CustomLinkedList();
        stream.forEach(list::add);
        return list;
    }

    public static CustomLinkedList convertUsingReduce(Stream<Integer> stream) {
        return stream.reduce(new CustomLinkedList(), (list, element) -> {
            list.add(element);
            return list;
        }, (list1, list2) -> {
            list1.merge(list2); // Объединение двух списков, если это необходимо
            return list1;
        });
    }
}