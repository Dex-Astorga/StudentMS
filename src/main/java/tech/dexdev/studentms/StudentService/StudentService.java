package tech.dexdev.studentms.StudentService;

import org.springframework.stereotype.Service;
import tech.dexdev.studentms.Student.Student;
import tech.dexdev.studentms.StudentRepository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;


    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student save(Student student) {
        return repository.save(student);
    }
}
