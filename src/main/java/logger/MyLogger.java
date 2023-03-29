package logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyLogger implements Logger {
    private static MyLogger instance;
    protected int counter;

    private MyLogger() {
        counter = 1;
    }

    public static MyLogger getInstance() {
        if(instance == null) {
            instance = new MyLogger();
        }
        return instance;
    }

    @Override
    public void log(String message) {
        LocalDateTime localDateTime = LocalDateTime.now();
        String currentTime = localDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        System.out.println(String.format("[%s %d] %s", currentTime, counter, message));
        counter++;
    }
}
