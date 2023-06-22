import java.util.*;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.HashModel;
import Model.Student1;
import View.ViewEng;

public class App {
    public static void main(String[] args) {

        Map<Long,Student1> student1Map = new HashMap<>();
        student1Map.put(1L,new Student1("Ivan", "Orlov", 18));
        student1Map.put(2L,new Student1("Kirill", "Petrov", 20));
        student1Map.put(3L,new Student1("Tomara", "Smirnova", 21));
        student1Map.put(4L,new Student1("Sergey", "Shport", 19));
        student1Map.put(5L,new Student1("Inna", "Cheichuk", 18));

        iGetModel model = new HashModel(student1Map);
        //iGetView view = new View();
        iGetView viewEng = new ViewEng();


        // запускаем новый подключенный файл через подключенный интерфейс
        Controller controller = Controller.getviewEng(viewEng,model);
        controller.run();
    }

}
