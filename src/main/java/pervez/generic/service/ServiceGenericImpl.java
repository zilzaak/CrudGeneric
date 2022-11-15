package pervez.generic.service;


import org.springframework.beans.factory.annotation.Autowired;

import pervez.generic.entity.BaseEntity;
import pervez.generic.repository.GenericRepository;

import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;

public class ServiceGenericImpl<T extends BaseEntity> implements ServiceGeneric<T> {

    @Autowired
    protected GenericRepository<T> genericRepository;

    @Autowired
    private EntityManagerFactory entityManagerFactory;


    @Override
    public List<T> findAll() {
        return genericRepository.findAll();
    }

    @Override
    public T save(T entity) {
        return genericRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        genericRepository.deleteById(id);
    }

    @Override
    public Optional<T> findById(Long id)  {
        return genericRepository.findById(id);
    }


    @Override
    public T update(T entity)  {
        return genericRepository.save(entity);
    }



}
