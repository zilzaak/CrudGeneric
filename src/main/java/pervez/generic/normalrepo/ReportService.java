package pervez.generic.normalrepo;



import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import pervez.generic.entity.Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    @Autowired
    private Addressrepo repository;


    public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\pervez\\Downloads";
        List<Address> Addresss = repository.findAll();
        //load file and compile it
        File file = ResourceUtils.getFile("classpath:Address.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(Addresss);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "parvez");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\Address.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\Address.pdf");
        }

        return "report generated in path : " + path;
    }
}
