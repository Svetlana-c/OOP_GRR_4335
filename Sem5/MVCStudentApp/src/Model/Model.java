package Model;

import java.util.List;
import java.util.Map;

public class Model implements iGetModel {
    private List<Student1> student1List;
    public Model(List<Student1> student1List){
        this.student1List = student1List;
    }

    @Override
    public Map<Long, Student1> getAllHashMapStudent() {
        return null;
    }

    @Override
    public String deleteStudentBuyID() {
return null;
    }
}
