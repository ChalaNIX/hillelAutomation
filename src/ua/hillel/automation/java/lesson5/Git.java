package ua.hillel.automation.java.lesson5;

public class Git {
    /*
    1. Створення пустого репо на гітхабі з файлом gitignore
    2. Відкрити на компі Git Bash
    -команда для створення ключа: ssh-keygen.exe
    -команда для перевірки наявності ключа: $ ls /c/Users/Анжела/.ssh/. результат: id_rsa  id_rsa.pub
    id_rsa - приватний ключ, id_rsa.pub - відкритий ключ, можна ділитись.
    -команда для отримання відкритого ключа: $ cat /c/Users/Анжела/.ssh/id_rsa.pub
    3. Скопіювати ключ id_rsa.pub в Settings на гітхабі. В сетінгах репозиторію на гітзабі додати в Collaborators викладача
    4. Відкрити IDEA
    - вкладка VCS -> Enable Version Control Integration...
    5.GitHub ->repo-> Code-> SSH link
    6. IDEA. Вкладка Git->Manage Remotes -> додати SSH link з гітхаба. Ерор меседж
    The authenticity of host 'github.com (140.82.121.3)' can't be established. - це окей при першому підключені
    Тепер ми з'єднали хмарний та локальний репозиторії.
    7. IDEA. Вкладка Git -> Fetch (підтягнути всі гілки з remote)
    -відкрити Git знизу, вибрати ремоут гілку Main
    -вкладка Git зверху - Pull (вибрати гілку ремоут main)
    -вкладка File - Invalidate Caches -> Invalidate and Restart (перезапуск)
    -Checkout на гілку main
    - в ідеї відкрити файл gitignore і додати вкінці строки:
    .idea
    -відкрити для коміту в IDEA: Ctrl + K  і закомітити
    - ctrl + t
    *.iml
    -відкрити для коміту в IDEA: Ctrl + K  і закомітити
    - ctrl + t

    Додавання нової фічі:
    -створити в ідея нову гілку
    -створити клас, закомітити на гітхаб
    -відкрити гітхаб - з'являється кнопка Compare & pull request
    -Reviewers - додати викладача


     */
}
