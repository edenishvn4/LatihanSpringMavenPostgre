package doku.spring.test.dokuspringtrain.service;

import doku.spring.test.dokuspringtrain.entity.Grup;
import doku.spring.test.dokuspringtrain.repository.GrupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupService {
    @Autowired
    GrupRepository grupRepository;

    public List<Grup> getAll(){
        return grupRepository.findAll();
    }
}
