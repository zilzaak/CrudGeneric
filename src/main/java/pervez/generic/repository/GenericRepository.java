package pervez.generic.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pervez.generic.entity.BaseEntity;

@Repository
public interface GenericRepository<T extends BaseEntity> extends JpaRepository<T, Long> {

    @Query(value ="Select * from dual" ,nativeQuery = true)
    String customQuery(String query);
}
