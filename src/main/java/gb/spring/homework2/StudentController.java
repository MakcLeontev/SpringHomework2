package gb.spring.homework2;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable long id){
        return studentRepository.getById(id);
    }

    @GetMapping("/")
    public List<Student> getAllStudents(){
        return studentRepository.getAll();
    }

    @GetMapping("/search")
    public List<Student> getStudentsContainsName(@RequestParam String name){
        return studentRepository.getName(name);
    }

    @GetMapping("/group/{groupName}/student")
    public List<Student> getStudentsByGroupName(@PathVariable String groupName){
        return studentRepository.getStudentsByGroupName(groupName);
    }
    @PostMapping("/")
    public Student createStudent(@RequestBody Student student){
        studentRepository.addStudent(student);
        return student;
    }

    @DeleteMapping("/{id}")
    public Student deleteStudent(@PathVariable long id){
        Student student = studentRepository.getById(id);
        studentRepository.delStudent(student);
        return student;
    }


}
