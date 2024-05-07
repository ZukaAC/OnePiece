package projects.zuka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import projects.zuka.persistence.Data;
import projects.zuka.persistence.DataRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class MainController {

    private DataRepository dataRepository;

    @Autowired
    public void setDataRepository(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/api/onepiece"})
    public ResponseEntity<Iterable<Data>> showData() {
        Data character = dataRepository.findById(1).get();
        return new ResponseEntity<>(dataRepository.findAll(), HttpStatus.OK);
    }

}
