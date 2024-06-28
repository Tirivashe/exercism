public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf(':');
        return logLine.substring(index + 1).trim();
    }

    public static String logLevel(String logLine) {
        int index = logLine.indexOf(':');
        return logLine.substring(0, index).toLowerCase().replace('[', ' '). replace(']', ' ').trim();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
