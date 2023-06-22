package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Model.Student1;

// создадим класс инструмент контролирующий работу всей логики
public class Controller {
private iGetView view;
private iGetView viewEng;
private iGetModel model;
private Map<Long,Student1> students1;

    public Controller(iGetView viewEng, iGetModel model) {
        this.viewEng = viewEng;
        this.model = model;
    }

    public static Controller getviewEng(iGetView viewEng,iGetModel model){
        return new Controller(viewEng,model);
    }
    public void getAllStudent(){
        students1 = model.getAllHashMapStudent();
    }

    public boolean testData(){
        if(students1.size() > 0){
            return true;
        }else {
            return false;
        }
    }
   
    public void update(){
       
        getAllStudent();
        if (testData()){
            viewEng.printAllStudent(students1);
        }
        else {
            System.out.println("Список студентов пуст!");
        }
       
    }

    public void updateEngl(){
       
        getAllStudent();
        if (testData()){
            viewEng.printAllStudent(students1);
        }
        else {
            System.out.println("List student is empty!");
        }
   
    }

      
    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = viewEng.prompt("Enter the command:");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Exit the program!");
                    break;
                case LIST:
                    getAllStudent();
                    viewEng.printAllStudent(students1);
                    break;
                case DELETE:
                    model.deleteStudentBuyID();
                    viewEng.printAllStudent(students1);
                    break;
            }
        }
    }
}
