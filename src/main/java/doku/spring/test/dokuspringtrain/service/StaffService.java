package doku.spring.test.dokuspringtrain.service;

import doku.spring.test.dokuspringtrain.entity.Staff;
import doku.spring.test.dokuspringtrain.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffRepository staffRepository;

    public List<Staff> getAll(){
        return staffRepository.findAll();
    }
}
