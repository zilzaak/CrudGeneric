package pervez.generic.service;


import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pervez.generic.entity.BaseEntity;
import pervez.generic.entity.Student;
import pervez.generic.repository.GenericRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
@Repository
public class ServiceGenericImpl<T extends BaseEntity> implements ServiceGeneric<T> {
	


  @Autowired
    protected GenericRepository<T> genericRepository;
   

    @Autowired
    private EntityManagerFactory em;


    @Override
    public T save(T entity) {
   //return genericRepository.save(entity);
   EntityManager em1=em.createEntityManager();
   em1.persist(entity);
   return entity;
    }
    
    

    @Override
    public T update(T entity)  {
      //  return genericRepository.save(entity);
    	   EntityManager em1=em.createEntityManager();
    	   em1.merge(entity);
    	   return entity;
    	
    }
    
    
    @Override
    public void delete(Long id) {
     //   genericRepository.deleteById(id);
 	   EntityManager em1=em.createEntityManager();
 	   Object o=em1.find(Object.class, id);
 	   em1.remove(o);	
    	  }
    
    

    @Override
    public T findById(Long id )  {
    	T t=genericRepository.findById(id).get();
       return  t;
    }

    
    
    @Override
    public List<T> findAll()   { 

   
    		  
    		  return genericRepository.findAll();
    }



}
