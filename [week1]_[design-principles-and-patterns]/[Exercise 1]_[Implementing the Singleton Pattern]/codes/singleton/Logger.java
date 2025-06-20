package singleton;
public class Logger {
    private static Logger singleLoggerInstance;
    private Logger() {
        System.out.println("Logger initialized.");
    }
    public static Logger getInstance() {
        if (singleLoggerInstance == null) {
            singleLoggerInstance = new Logger();
        }
        return singleLoggerInstance;
    }
    public void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}
