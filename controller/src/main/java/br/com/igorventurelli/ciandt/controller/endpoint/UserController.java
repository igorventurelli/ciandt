package br.com.igorventurelli.ciandt.controller.endpoint;

import br.com.igorventurelli.ciandt.controller.representation.UserRepresentation;
import br.com.igorventurelli.ciandt.dto.dto.UserDTO;
import br.com.igorventurelli.ciandt.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public UserRepresentation index() {
        return new UserRepresentation(service.index());
    }
}
