package logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Logger logger = MyLogger.getInstance();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        logger.log("Запускаем программу");
        System.out.println("Привет");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int max = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>(size);
        for (int i=0; i<size; i++) {
            list.add(random.nextInt(max));
        }
        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра:");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);

        logger.log("Запускаем фильтрацию");
        list = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + list);
        logger.log("Завершаем программу");
    }
}
