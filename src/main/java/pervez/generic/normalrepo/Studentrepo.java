package pervez.generic.normalrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import pervez.generic.entity.Student;

public interface Studentrepo extends JpaRepository<Student,Long>{

}
