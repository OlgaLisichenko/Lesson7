package task2;

public interface JobTitle {

    default void printTitle(String title) {
        System.out.println("Job title: " + title);
    }
}
