package tech.dexdev.studentms.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.dexdev.studentms.Student.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
