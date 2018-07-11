package doku.spring.test.dokuspringtrain.controller;

import doku.spring.test.dokuspringtrain.entity.Address;
import doku.spring.test.dokuspringtrain.entity.Employee;
import doku.spring.test.dokuspringtrain.entity.Staff;
import doku.spring.test.dokuspringtrain.repository.StaffRepository;
import doku.spring.test.dokuspringtrain.service.ApiService;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("doku/api")
public class ApiController {
    @Autowired
    StaffRepository repository;

    @GetMapping(value = "/welc")
    public String welcome(){
        return "ini coba get";
    }

    @GetMapping(value = "/str")
    public Employee getEmp(){
        ApiService apiService=new ApiService();
        return apiService.emp();
    }

    @GetMapping(value = "/oddev/{number}")
    public String oddev(@PathVariable("number") int number){
        ApiService apiService=new ApiService();
        return apiService.oddev(number);
    }
    @GetMapping(value="/encrypt")
    public String encrp(@RequestParam("nama") String nama){
        BasicTextEncryptor encrypt = new BasicTextEncryptor();
        encrypt.setPassword("encore");
        String res = encrypt.encrypt(nama);
        return res;
    }

    @GetMapping(value="/decrypt")
    public String decrp(@RequestParam("nama") String nama){
        BasicTextEncryptor encrypt = new BasicTextEncryptor();
        encrypt.setPassword("encore");
        String res2 = encrypt.decrypt(nama);
        return "Hallo "+res2;
    }


}
