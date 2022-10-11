import task1.Task1;
import task2.Task2;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String message = "\nEnter the task number: 1 or 2. 0 - closing the program.";
        System.out.println(message);
        isScannerHaveInt(message);
        int taskNumber = scanner.nextInt();

        while (true) {
            switch (taskNumber) {
                case 1 -> Task1.task1();
                case 2 -> Task2.task2();
                case 0 -> {
                    scanner.close();
                    return;
                }
            }
            System.out.println(message);
            isScannerHaveInt(message);
            taskNumber = scanner.nextInt();
        }
    }

    public static void isScannerHaveInt(String message) {
        while (!scanner.hasNextInt()) {
            System.out.println(message);
            scanner.next();
        }
    }
}