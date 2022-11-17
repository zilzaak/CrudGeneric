package pervez.generic.service;



import java.util.List;
import java.util.Optional;

import pervez.generic.entity.BaseEntity;

public interface ServiceGeneric<T extends BaseEntity>  {


    T save(T entity) ;
    void delete(Long id);
    T update(T entity);
   T findById(Long id) ;
    List<T> findAll() ;
    

}

