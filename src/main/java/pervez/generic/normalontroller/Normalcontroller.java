package pervez.generic.normalontroller;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sf.jasperreports.engine.JRException;
import pervez.generic.entity.Student;
import pervez.generic.normalrepo.Addressrepo;
import pervez.generic.normalrepo.ReportService;
import pervez.generic.normalrepo.Studentrepo;

@RestController
@RequestMapping("/normal")
public class Normalcontroller {

	@Autowired
	private Studentrepo srr;

	@Autowired
	private ReportService arr;
	
	@RequestMapping("/all")
	public List<Student> all(){
		
		return srr.findAll();
	}
	
	@GetMapping("/report/{format}")
    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
        return arr.exportReport(format);
    }

  
}
