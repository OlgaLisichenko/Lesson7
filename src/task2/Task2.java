package task2;

public class Task2 {

// 2. Создать классы "Директор", "Рабочий", "Бухгалтер".
// Реализовать интерфейс с методом, который печатает название должности
// и имплементировать этот метод в созданные классы.
    public static void task2() {

        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.printTitle(director.getTitle());
        worker.printTitle(worker.getTitle());
        accountant.printTitle(accountant.getTitle());
    }
}
