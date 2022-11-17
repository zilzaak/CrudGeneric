package pervez.generic.normalrepo;
import org.springframework.data.jpa.repository.JpaRepository;

import pervez.generic.entity.Address;
public interface Addressrepo extends JpaRepository<Address,Integer> {

}
