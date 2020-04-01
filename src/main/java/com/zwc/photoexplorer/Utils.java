package com.zwc.photoexplorer;

public class Utils {

    public static Thread backend(Runnable action) {
        Thread thread = new Thread(action);
        thread.start();
        return thread;
    }

    public static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
