package pervez.generic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import pervez.generic.entity.BaseEntity;

public interface ControllerGeneric<T extends BaseEntity>  {

    ResponseEntity<Object> save(@RequestBody T entity) ;
    ResponseEntity<T> delete(Long id) ;
    ResponseEntity<T> update(@RequestBody T entity) ;

    ResponseEntity<T> findAll() ;
    ResponseEntity<T> findById(@PathVariable Long id) ;
   
}
