package pervez.generic;

import org.springframework.stereotype.Repository;

import pervez.generic.entity.Student;
import pervez.generic.repository.GenericRepository;

import java.util.Optional;
@Repository
public interface StudentRepository extends GenericRepository<Student>{

   Optional<Student> findById(Long id);
}
