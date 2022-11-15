package pervez.generic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import pervez.generic.entity.BaseEntity;
import pervez.generic.repository.GenericRepository;
import pervez.generic.service.ServiceGeneric;

import javax.persistence.criteria.Predicate;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings({"unchecked", "rawtypes"})
@ResponseBody
public class ControllerGenericImpl<T extends BaseEntity> implements ControllerGeneric<T> {

    @Autowired
    private ServiceGeneric<T> genericService;
    @Autowired
    private GenericRepository<T> repo;
    
  
   
    
    @Override
    @PostMapping("/create")
    public ResponseEntity<Object> save(@RequestBody T entity)  {
        
            return new ResponseEntity(genericService.save(entity), HttpStatus.OK);
 
    }

  
    
    @Override
    @GetMapping("/getall")
    public ResponseEntity<T> findAll(){
      
            return new ResponseEntity(genericService.findAll(), HttpStatus.OK);
        
    }

   
    @Override
    @GetMapping("/get/{id}")
    public ResponseEntity<T> findById(@PathVariable Long id){
             Optional<T> t = genericService.findById(id);
            return new ResponseEntity(t, HttpStatus.OK);
  
    }



	@Override
	@GetMapping("/delete")
	public ResponseEntity<T> delete(T entity) {
		// TODO Auto-generated method stub
		
		  repo.delete(entity);
return  new ResponseEntity(entity,HttpStatus.OK);
	}



	@Override
	@GetMapping("/update")
	public ResponseEntity<T> update(T entity) {
		// TODO Auto-generated method stub
return new ResponseEntity(genericService.update(entity), HttpStatus.OK);
	}



}
