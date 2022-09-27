package ru.netology;

public class Worker {
    private OnTaskDoneListener callback;

    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start(){
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + (i + 1) + " is done");
        }
    }

    public void executeWithError() {
        for (int i = 0; i < 100; i++) {
            if (i == 32){
                errorCallback.onError("Task " + (i + 1) + " wasn't done");
            } else {
                callback.onDone("Task " + (i + 1) + " is done");
            }
        }
    }
}
