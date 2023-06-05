package ua.hillel.automation.java.lesson8.homework;

public enum Level {
    INFO(ConsoleColors.GREEN+"Info:"+ConsoleColors.RESET),
    DEBUG(ConsoleColors.PURPLE+"Debug:"+ConsoleColors.RESET),
    WARN(ConsoleColors.YELLOW+"Warn:"+ConsoleColors.RESET),
    ERROR(ConsoleColors.RED+"Error:"+ConsoleColors.RESET);

    private String level;
    Level(String level) {
        this.level=level;
    }
    public String getLevel() {
        return level;
    }
}
