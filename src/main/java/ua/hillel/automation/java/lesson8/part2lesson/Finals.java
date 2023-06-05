package ua.hillel.automation.java.lesson8.part2lesson;
////final-закритий для зміни(константа)
//final метод - емпліментація методу не потребує переопредения (override під час успадкування)
public class Finals {
    //можна одразу присвоювати значення для final
    private final String FINAL_VAR_NAME = "name";
    //а можна присвоювати значення через конструктор
    //взагалі не присвоїти - буде помилка
    public final String FINAL_CONST_VAR;

    String averageFIeld = "122";
    public Finals(String value) {
        FINAL_CONST_VAR = value;
    }
    //about finals (statuses)
    public void setStatus(String status) {
        System.out.println("Setting status: " + status);
    }

    //setStatus with enum (Status)
    public void setStatusEnum(Status status) {
        System.out.println("Setting status: " + status);
        System.out.println("Setting status: " + status.getStatus());
    }
    public final void finalMethod() {
        System.out.println("I'm final in Finals.class");
    }
}
