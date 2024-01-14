package gb.spring.homework2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class StudentRepository {

    private final List<Student>students;

    public StudentRepository() {
        this.students = new ArrayList<>();
        students.add(new Student("Alexey Ivanov", "math"));
        students.add(new Student("Alexey Petrov", "math"));
        students.add(new Student("Ivan Semenov", "math"));
        students.add(new Student("Sergey Saparkin", "math"));
        students.add(new Student("Sasha Grigoryev", "enlish"));
        students.add(new Student("Roman Vodolevskiy", "enlish"));
        students.add(new Student("Ivan Eremeev", "enlish"));
        students.add(new Student("Stanislav Voronov", "enlish"));
        students.add(new Student("Igor Cheremisov", "ivt"));
        students.add(new Student("Andrey Vasilyev", "ivt"));
    }

    public Student getById(long id){
        return students.stream().filter(it -> Objects.equals(it.getId(),id)).findFirst().orElse(null);
    }

    public List<Student> getAll(){
        return students;
    }

    public List<Student> getName(String name){
        return students.stream().filter(it -> it.getName().contains(name)).toList();
    }

    public List<Student> getStudentsByGroupName(String groupName){
        return students.stream().filter(it -> it.getGroupName().equals(groupName)).toList();
    }
     public void addStudent(Student student){
        students.add(student);
     }
     public void delStudent(Student student){
        students.remove(student);
     }
}
