package org.example;

import java.util.Scanner;
import java.util.stream.Stream;

public class CreatingList {
    public static Stream.Builder<Integer> readInputToStreamBuilder() {
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        System.out.println("Введите элементы списка (вводите '-1' для завершения):");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break; // Прекращаем сбор данных при вводе '-1'
            }
            try {
                int number = Integer.parseInt(input);
                streamBuilder.add(number); // Добавляем число в Stream.Builder
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите валидное число или '-1' для выхода.");
            }
        }
        return streamBuilder;
    }
}