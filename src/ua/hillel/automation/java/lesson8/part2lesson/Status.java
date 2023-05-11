package ua.hillel.automation.java.lesson8.part2lesson;

public enum Status {
    //для юзера ці варіанти можуть відрізнятись
    NEW("New"),
    IN_PROGRESS("In progress"),
    DONE("Done");

    private String status;

    //конструктор для enum (не може бути публічним)
    Status(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}
