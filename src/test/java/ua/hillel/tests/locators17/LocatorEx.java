package ua.hillel.tests.locators17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorEx {
    @Test
    public void locatorsTest() {
        WebDriverManager.chromiumdriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        //findElement - повертає перший елемент/exception -NoSuchElement
        //findElements - повертає list елементів, які відповідають локатору/пуста коллекція
        //search by id - (унікальний атрибут html тегу). розробники не люблять їх додавати. значення можуть бути динамічними
        driver.findElement(By.id("page-footer"));
        //by name - не унікальне.пошукати по html щоб ім'я не повторювалось
        driver.findElement(By.name("page-footer"));
        //by class name-значення атрибуду class у елемента.незручно якщо назва довга. деви можуть змінювати їх.юзаєм якщо коротке
        driver.findElement(By.className("large-4 large-centered columns"));
        //by tag name - div,a,body - надто багато. зручно якщо комбінуєм пошуки (шукати елементи в знайденому елементі)a-посилання
        driver.findElement(By.tagName("div")).findElement(By.tagName("a"));


        driver.get("https://the-internet.herokuapp.com/");
        //by link text-назва гіперпосилання
        driver.findElement(By.linkText("Disappearing Elements"));
        //by partial link text - частина назви
        driver.findElement(By.partialLinkText("and Drop"));


        //by css
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        //search on html #id. example: #page-footer (можна конкретизувати перед решіткою - div#page-footer
        //name,ex: [name='viewport'] -краще одинарні кавички
        driver.findElement(By.cssSelector("[name='viewport']"));
        //class name - .large-12
        //пошук по двум класам - .large-12.large-centered
        //tag - частіше це пошук в середині батьківського елементу
        //пошук посилання в середині div large-12 columns: .large-12 columns a
        //або у посилання є клас alert: .large-12 columns a .alert
        //пробіл знак більше - перший рівень вкладеності, наприклад: .large-12 columns > .alert
        //(декілька рівнів вкладеності) .large-12 columns > div.large-2 > .alert
        //якщо нам потрібно друге посилання (нумерація починається з одиниці): .large-12 columns > div.large-2 > a:nth-of-type(2)
        //інший варіант запису пошуку a(де посилання є кнопкою): .large-12 columns a[class='button']

        //Таким чином якщо ми використовуємо css .large-12 columns a
        // в нас 1 запит до браузера,
        // а не два  driver.findElement(By.tagName("div")).findElement(By.tagName("a"));


        //XPath
        //шлях до елементу в середині dom дерева (document object model)
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        ///абсолютний шлях: html/body/
        //зазвичай шляхи набагато довше.
        //відносний шлях //div/h3 (на будь якому рівні шукай елемент div у якого на 1 рівні вкладеності є елемент h3
        //відності шляхи більш стабільні при зміні ui, вони коротші
        //конкретизація атрибуту div: //div[@class='example']/h3
        //будь який елемент, який має атрибул клас з назвою example та має всередині заголовок третього рівня: *[@class='example']/h3
        //в XPath треба вказувати назву класу повністю, а не окремі назви як в css
        //знайти гіперпосилання (чіткий пошук): //a[text()='foo']
        //нечіткий пошук(містить в собі): //*contains(text(),'DOM')
        //або: //a[contains(@class,'success')]
        // n-ний елемент: //a[contains(@class,'button')][3]

        //навігація по табличці
        //відносний шлях може бути з двома // (пропускаєм початок шляху, і кусок всередині): //table//tr[4]/td[3]
        driver.get("https://the-internet.herokuapp.com/login");
        //уніфікований локатор в який передається статичний лейбл
        //потім можна піднятися на одну сходинку вверх (..) і шукати від батьківського класу
        //  //label[text()='Username']/../input           (input - це атрибут)

        driver.findElement(By.xpath(String.format("//label[text()='Username']/../input")));
        //назва лейблу може бути параметром:
        driver.findElement(By.xpath(String.format("//label[text()='%']/../input","Username")));
        driver.findElement(By.xpath(String.format("//label[text()='%']/../input","Password")));
        //комбінування and/or
        // //input[@type='text' and @name='username']
        // //input[@type='text' or @name='username']

        //дії над елементами
        //зберегти (якщо використовуємо більше разу)
        WebElement element = driver.findElement(By.xpath(String.format("//label[text()='%']/../input","Password")));
        //клікнути (драйвер не зможе якщо елемент перекритий іншим елементом-певні скроли/наведення/клікнути деінде)
        element.click();
        //отримати значення атрибуту (передаємо назву атрибуту)
        element.getAttribute("input");
        //вся інфа про елемент (і дочірні елементи)
        element.getAttribute("innerHTML");
        //дії: якщо елемент містить textarea - введи текст/клікни
        element.getAttribute("innerHTML").contains("textarea");
        //отримати текст який присутній в нашому елементі (показує і дочірні/приховані(показуються при наведені))
        //якщо текст прихований - використовуємо innerHTML щоб його знайти
        element.getText();
        //очистити значення поля/textarea
        element.clear();
        //надрукувати значення
        element.sendKeys("qwerty");
        //для перевірки - true/false(присутній але прихований)
        element.isDisplayed();
        //чи активний -атрибут disable (не можна клікнути по елементу/ввести текст)
        element.isEnabled();
        //чи вибраний чекбокс
        element.isSelected();
        //для елементів типу форма де є окрема кнопка з тайпом submit (рідко)
        element.submit();
        //продовжити шукати елементи
        element.findElement(By.name("password"));
        //натиснути Enter після вводу
        element.sendKeys("Selenium Webdriver" + Keys.ENTER);


    }
}
