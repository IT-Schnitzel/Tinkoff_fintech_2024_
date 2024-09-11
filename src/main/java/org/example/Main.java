package org.example;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.example.ListPrint.printList;
import java.util.stream.Stream;

public class Main {
    private  static Logger logger= LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("App start");
        logger.info("Created CustomLinkedList");
        Stream.Builder<Integer> streamBuilder = CreatingList.readInputToStreamBuilder();
        CustomLinkedList linkedList = StreamToLinkedList.convert(streamBuilder.build());
        logger.warn("Added input numbers");
        linkedList.add(1);
        logger.info("Adding");
        printList(linkedList);
        System.out.println("Get 0: " + linkedList.get(0));
        logger.info("Gettnig");
        linkedList.remove(0);
        logger.info("Removing");
        System.out.println("Contains 1: " + linkedList.contains(1));
        logger.info("if_contains");
        linkedList.addAll(Arrays.asList(67, 21, 11));
        logger.info("Adding list");
        printList(linkedList);
        logger.info("END");
    }
}