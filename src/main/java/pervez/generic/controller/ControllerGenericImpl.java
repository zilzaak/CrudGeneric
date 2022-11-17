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
import pervez.generic.entity.Student;
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
private T t;
    @Autowired
    private ServiceGeneric<T> genericService;
    
   
    @Override
    @PostMapping("/create")
    public ResponseEntity<Object> save(@RequestBody T entity)  {
        
            return new ResponseEntity(genericService.save(entity), HttpStatus.OK);
 
    }
    
	@Override
	@GetMapping("/delete")
	public ResponseEntity<T> delete(Long id) {
		// TODO Auto-generated method stub
		T t=genericService.findById(id);
		genericService.delete(id);
return  new ResponseEntity(t,HttpStatus.OK);
	}



	@Override
	@PostMapping("/update")
	public ResponseEntity<T> update(T entity) {
		// TODO Auto-generated method stub
return new ResponseEntity(genericService.update(entity), HttpStatus.OK);
	}
	
    @Override
    @GetMapping("/getall")
    public ResponseEntity<T> findAll(){
      
            return new ResponseEntity(genericService.findAll(), HttpStatus.OK);
        
    }

   
    @Override
    @GetMapping("/get/{id}")
    public ResponseEntity<T> findById(@PathVariable Long id){

            return new ResponseEntity(   genericService.findById(id), HttpStatus.OK);
  
    }


}
