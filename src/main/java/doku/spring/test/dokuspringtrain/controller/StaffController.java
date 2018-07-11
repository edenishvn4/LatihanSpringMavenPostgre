package doku.spring.test.dokuspringtrain.controller;

import doku.spring.test.dokuspringtrain.entity.Staff;
import doku.spring.test.dokuspringtrain.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/doku/api/staff")
public class StaffController {
    @Autowired
    StaffService staffService;

    @GetMapping(value="/getAll")
    public List<Staff> getAll(){
        return staffService.getAll();
    }
}
