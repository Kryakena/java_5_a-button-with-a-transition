package site.kryakena.MyFirstSite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//* Аннотация к контроллеру помогает Sping понять, какой класс является повторителем нашего запроса. Он перехватывает запрос и немедленно отправляет информацию
public class SiteController {

    @GetMapping ("/main")
    //* Использование GetMapiing отправляет ответ на запрос GET на указанный адрес маршрутизатора
    public String getMain() {
        return "templates/main.html"; }
}