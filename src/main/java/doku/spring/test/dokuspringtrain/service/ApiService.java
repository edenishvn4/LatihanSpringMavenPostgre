package doku.spring.test.dokuspringtrain.service;

import doku.spring.test.dokuspringtrain.entity.Address;
import doku.spring.test.dokuspringtrain.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {


    public String oddev(int number){
        return number%2==0? "even": "odd";
    }

    public Employee emp(){
        Employee empl = new Employee();
        empl.setId(1);
        empl.setNama("irsha");
        empl.setUsia(22);

        List<Address> adrr=new ArrayList<Address>();
        Address alm = new Address();
        alm.setCity("Tangerang");
        alm.setLocation("bawah tebing");
        adrr.add(alm);

        empl.setAlamat(adrr);
        return empl;
    }

}
