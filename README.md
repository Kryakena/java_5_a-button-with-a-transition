# ПРОЕКТ (Windows 10) - Создание 1го сайта на java (для новичков)

Источник: видео от 09.12.2022 г. "JAVA СОЗДАНИЕ САЙТА С 0" https://www.youtube.com/watch?v=lXDJqbpQ-rg

# Подготовка к созданию сайта на JAVA

1. Скачать и установить JDK Development Kit 23.0.1 с официального сайта https://www.oracle.com/java/technologies/downloads/#jdk21-windows
![2024-11-13_00-33-53](https://github.com/user-attachments/assets/bdfbde9f-fe1e-418b-ab16-ce1542857abe)

2. в Windows нажать комбинацию клавиш "Windows+S", в поисковой строке набрать "перемен"
   
3. выбрать "Изменение среды текущего пользователя"
![2024-11-13_11-54-44](https://github.com/user-attachments/assets/79efe478-35e1-45dd-9ffb-527ce977b02f)

4. нажать кнопку "Создать", чтобы создать переменную. Имя переменной: JAVA_HOME, значение переменной (путь к файлу): C:\Program Files\Java\jdk-23\bin\java.exe. Нажать кнопку "ОК"
![2024-11-14_10-45-22](https://github.com/user-attachments/assets/371f9fe8-3473-404e-82e3-20fa50cfaa06)

5. скачать архив с папкой Apache Maven с официального сайта https://maven.apache.org/download.cgi
![2024-11-13_11-15-19](https://github.com/user-attachments/assets/117c507b-e82f-4c9d-b769-173385ce81a4)

6. вытаскиваем из zip архива папку "apache-maven-3.9.9", запихиваем её в папку "Program Files", будет путь: C:\Program Files\apache-maven-3.9.9

7. Выбрать "Path" ("Изменение среды текущего пользователя" = "Shift+S") и нажать кнопку "Изменить". Потом кнопку "Создать" и вставить путь к файлу Maven "C:\Program Files\apache-maven-3.9.9\bin\mvn" Сохранить изменения кнопкой "ОК". Закрыть окно "Системные переменные" кнопкой "ОК"

8. Скачать и установить IntelliJ IDEA Community Edition https://www.jetbrains.com/idea/download/?section=windows
![2024-11-13_00-35-05](https://github.com/user-attachments/assets/b2eea203-24fd-4983-a803-8a66913d50a9)

9. зайти на сайт фреймворка Spring https://start.spring.io/

10. создать сборку в Spring:
	- заполнить поля Group и Artifact;
	- выбрать язык Java и его версию; 
	- фреймворк Maven (Apache Maven); 
	- добавить Зависимости:
		- **Spring Web**
		- **Thymeleaf**
![2024-11-13_00-37-12](https://github.com/user-attachments/assets/2bf3129c-628c-42b8-868c-16f185085a36)

11. Нажать на кнопку "Generate"

12. Распаковать скаченный zip архив на диск D в папку с будущим проектом.

13. запустить папку, ранее извлеченную из скачанного архива, с помощью IntelliJ IDEA Community Edition

14. src --> main --> java --> папка с названием твоего сайта --> правой клавишей мыши щелкнуть по данной папке

15. в меню нажать "New" --> "Java Class" --> "SiteController" --> кнопка "Enter" на клавиатуре

16. в файле с названием сайта ввести к примеру:
    
```java
package site.kryakena.MyFirstSite;  
  
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
  
@SpringBootApplication  
public class MyFirstSiteApplication {  
  
    public static void main(String[] args) {  
       SpringApplication.run(MyFirstSiteApplication.class, args);  
    }  
  
}
```

17. в файле "SiteController" ввести к примеру:

```java
package site.kryakena.MyFirstSite;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.Mapping;  
  
@Controller  
//* Аннотация к контроллеру помогает Sping понять, какой класс является повторителем нашего запроса. Он перехватывает запрос и немедленно отправляет информацию
public class SiteController {  
  
    @GetMapping ("/main")  
    //* Использование GetMapiing отправляет ответ на запрос GET на указанный адрес маршрутизатора 
    public String getMain() {  
        return "main.html"; }  
}
```

18. "resources" --> правой клавишей мыши щелкнуть по папке "templates" --> "New" --> "HTML File" --> main --> кнопка "Enter" на клавиатуре

19. в файле "main.html" ввести к примеру: 

```HTML
<!DOCTYPE html>  
<html lang="ru">  
<head>  
    <meta charset="utf-8">  
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <title>HELLO WORLD</title>  
</head>  
<!--<style>  
    h1 {
	color: green;
	font-size: 200px;
	padding: 30px;
	display: none;
	}  
    body {
	background: black;
	}
</style>-->  
<!--<script>  
    function helloShow(){
	document.getElementById('hello').style.display='block'
	document.getElementById('button').style.display='none'
	}
</script>-->  
<body>  
	<h1 id="hello">HELLO WORLD</h1>  
	<button onclick="helloShow()" id="button">SHOW</button>  
</body>  
</html>
```

20. зайти в файл с названием сайта из пункта 16

21. нажать в 7 строке на значок запуска сборки, в меню выбрать "Run" с зелёной стрелкой вправо
![2024-11-13_01-01-49](https://github.com/user-attachments/assets/46190131-6f4b-493c-86c7-a087464e78df)

22. подождать, пока сайт билдится (собирается)

23. если все успешно: открывается внизу IntelliJ IDEA Community Edition раздел "Run", где есть номер локального хоста, все данные и версии о сборке
![2024-11-13_01-05-18](https://github.com/user-attachments/assets/d95eb9ef-3405-4d07-b0e3-df9c612f4098)

24. в браузере в новой вкладке в адресной строке ввести "http://localhost:8080/main"
![2024-11-13_01-19-28](https://github.com/user-attachments/assets/e3fa7bd7-8c62-4812-8c7e-7a1c30866502)

25. Ввести в файле "main.html" 2 произвольных тега, добавить CSS и скрипт (что происходит при нажатии кнопки "SHOW")

```html
<!DOCTYPE html>  
<html lang="ru">  
<head>  
    <meta charset="utf-8">  
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <title>HELLO WORLD</title>  
</head>  
<style> /* здесь можно вводить любые значения, но как в файле CSS менять не получится */  
    h1 {  
        color: green; /* зеленый цвет шрифта */  
        font-size: 200px; /* размер шрифта */  
        padding: 30px; /* отступ от краёв */  
        /* Свойство margin-top CSS определяет внешний отступ в верхней части элемента. Значения длины: margin-top: 10px - абсолютное значение; margin-top: 1em - относительно размера текста; margin-top: 5% - относительно ширины ближайшего контейнера */  
        display: none;  
    }  
  
    .kryakena {  
    /* произвольный тег */  
        background: red;  
    }  
  
    .kryaken {  
        color: green;  
        font-size: 200px;  
        padding: 30px;  
    }  
  
    body {  
        background: black;  
    }  
</style>  
<script type="text/javascript">  
    function helloShow(){  
        document.getElementById('hello').style.display='block'  
        document.getElementById('button').style.display='none'  
    }  
</script>  
<body>  
	<h1 id="hello">HELLO WORLD</h1>  
	<button class='kryakena kryaken' onclick="helloShow()" id="button">SHOW</button>  
</body>  
</html>
```
26. src --> main --> resources --> templates --> application.properties

```html
server.port=80
```
27. в браузере в новой вкладке в адресной строке ввести "http://localhost:80/main"

28. при нажатии кнопки на клавиатуре "Enter" номер порта автоматически уходит и получается адрес http://localhost/main

29. IntelliJ IDEA Community Edition --> раздел в правом верхнем углу "Maven" --> нажать на кнопку "Консоль"
![2024-11-14_16-24-49](https://github.com/user-attachments/assets/ad004d80-6571-4360-bb1a-944827ce0524)

30. в модальном окне ввести команду "mvn clean install"
![2024-11-14_16-26-55](https://github.com/user-attachments/assets/361b9219-76af-4065-b159-a30e3d2e5341)

31. если успешно пройдет сборка - в разделе "Run" будет "Build success"
![2024-11-14_16-32-09](https://github.com/user-attachments/assets/2a0ada5c-efe8-45f0-96e3-855aa70636e5)

32. в разделе "Notifical" щелкнуть по ссылке о успешной сборке
![2024-11-14_16-34-02](https://github.com/user-attachments/assets/6551fb53-2a49-4839-be63-00d415756936)

33. появятся файлы в папке "target"
![2024-11-14_16-35-21](https://github.com/user-attachments/assets/bcbeddd9-f8bd-428a-a7ea-4f49719f2ea4)

34. открыть в IntelliJ IDEA Community Edition раздел "Git" --> стрелочка вниз --> "Settings"
![2024-11-14_17-13-43](https://github.com/user-attachments/assets/98a81e7a-5afd-4b6f-a00e-11825159858d)

35. выбрать "GitHub" --> нажать знак плюс и добавить свой аккаунт на GitHub
![2024-11-14_17-14-12](https://github.com/user-attachments/assets/14044bce-d9a0-44da-aa7d-a4bdbdbb8126)

36. чтобы раскрыть меню --> щелкнуть правой клавишей мыши на меню вверху и нажать в окошке "Show menu..."
![2024-11-14_17-27-16](https://github.com/user-attachments/assets/08b5344d-080c-43f1-a40c-13380f0525a6)

37. выбрать в "Git" --> "GitHub" --> "Share..."
![2024-11-14_17-29-20](https://github.com/user-attachments/assets/ae43fd3d-2ea4-4e1a-b35f-9eecc519725d)

38. дать название git и краткое название, нажать кнопку, чтобы расшарить
