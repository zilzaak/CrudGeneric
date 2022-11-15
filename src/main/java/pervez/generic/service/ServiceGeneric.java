package pervez.generic.service;



import java.util.List;
import java.util.Optional;

import pervez.generic.entity.BaseEntity;

public interface ServiceGeneric<T extends BaseEntity>  {

    List<T> findAll() ;
    T save(T entity) ;
    void delete(Long id);
    Optional<T> findById(Long id) ;
    T update(T entity);
}

