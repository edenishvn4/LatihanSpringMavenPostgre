package doku.spring.test.dokuspringtrain.controller;

import doku.spring.test.dokuspringtrain.entity.Grup;
import doku.spring.test.dokuspringtrain.service.GrupService;
import doku.spring.test.dokuspringtrain.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
@RequestMapping(value="/doku/api/grup")
public class GrupController {
    @Autowired
    GrupService grupService;

    @GetMapping(value="/grupAll")
    public List<Grup> getAll(){
        return grupService.getAll();
    }
}
