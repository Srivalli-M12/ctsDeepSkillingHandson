package singleton;
public class LoggerTest {
    public static void main(String[] args) {
        Logger loggerA = Logger.getInstance();
        Logger loggerB = Logger.getInstance();
        loggerA.logMessage("This is the first log message.");
        loggerB.logMessage("This is the second log message.");
        if (loggerA == loggerB) {
            System.out.println("Both loggerA and loggerB are the same instance.");
        } else {
            System.out.println("Different instances found! Singleton failed.");
        }
    }
}

