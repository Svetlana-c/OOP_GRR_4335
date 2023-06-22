package Controller;

import java.util.Map;

import Model.Student1;




public interface iGetView {
    void printAllStudent(Map<Long,Student1> student1s);

    String prompt(String massage);
}