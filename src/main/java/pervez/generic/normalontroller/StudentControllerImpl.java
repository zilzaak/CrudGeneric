package pervez.generic.normalontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pervez.generic.IStudentService;
import pervez.generic.controller.ControllerGenericImpl;
import pervez.generic.entity.Student;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentControllerImpl extends ControllerGenericImpl<Student> implements IStudentController {
	
	
	
	
 //   @Autowired
   // private IStudentService srvc;


  /*  @Override
    @Transactional
    public ResponseEntity<Object> save(Student entity) {
 super.save(entity);
return new ResponseEntity(entity,HttpStatus.OK);
    }

    */
    
    
    
/*    @Override
    public ResponseEntity<Student> findAll(){

        return new ResponseEntity(super.findAll(),HttpStatus.OK);
    }



    
    
    public ResponseEntity<String> delete(Long id){
                 srvc.delete(id);
       return new ResponseEntity("successfully deleted",HttpStatus.OK);
                 
    }

    
    
    @Override
    public ResponseEntity<Student> update(Student entity) {
        super.update(entity);
        
        return new ResponseEntity(entity,HttpStatus.OK);
    }

*/
}
