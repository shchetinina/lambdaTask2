package ru.netology;

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start();

        OnTaskErrorListener errorListener = System.out::println;
        Worker workerWithError = new Worker(listener, errorListener);
        workerWithError.executeWithError();
    }


}