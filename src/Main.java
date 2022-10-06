import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    final static int zeroList = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1: {
                    System.out.println("Введите задачу для планирования:");
                    String write = new Scanner(System.in).nextLine();
                    list.add(write);
                }
                break;
                case 2: {
                    if (list.size() == zeroList) {
                        System.out.println("Список пуст!");
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println((i + 1) + ". " + list.get(i));
                        }
                    }
                }
                break;
                case 3: {
                    if (list.size() == zeroList) {
                        System.out.println("Нету задач для удаления");
                    } else {
                        System.out.println("Введите номер задачи которую хотите удалить");
                        int numberDel = new Scanner(System.in).nextInt();
                        if (list.size() < numberDel) {
                            System.out.println("Такого номера нету");
                        } else {
                            list.remove(numberDel - 1);
                        }
                    }
                }
                break;
                case 0:
                    return;
                default:
                    System.out.println("Такой команды нет!");
            }
        }
    }
}