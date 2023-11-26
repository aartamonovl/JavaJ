package homework1.task1;

// Напишите программу, которая использует Stream API для обработки списка чисел.
// Программа должна вывести на экран среднее значение всех четных чисел в списке.

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 5, 8, 11, 4, 12);
        double avg = list.stream()
                .mapToInt(num -> num)
                .filter(num -> num % 2 == 0)
                .average().getAsDouble();
        System.out.println("List: " + list + "\n"
                + "Even number avg: " + avg);
    }
}
