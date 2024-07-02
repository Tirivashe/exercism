public class LogLine {
    public String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String logLevel = parseLogLevel();
        return switch (logLevel) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        return getLogLevel().getCode()+":"+parseLogMessage();
    }

    private String parseLogLevel() {
        return this.logLine.split(": ")[0].replace("[", "").replace("]", "");
    }

    private String parseLogMessage() {
        return this.logLine.split(": ")[1];
    }
}
