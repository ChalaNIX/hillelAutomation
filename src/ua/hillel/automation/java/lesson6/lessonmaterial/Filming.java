package ua.hillel.automation.java.lesson6.lessonmaterial;
/*
Інтерфейси схожі на абстрактні класи.
 */
public interface Filming {
    void makeVideo();

    default public void shareVideo() {  //метод який не треба перезаписувати в класі що використовує цей інтерфейс

    }
}
