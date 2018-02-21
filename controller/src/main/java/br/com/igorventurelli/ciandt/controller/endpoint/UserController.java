package br.com.igorventurelli.ciandt.controller.endpoint;

import br.com.igorventurelli.ciandt.controller.representation.UserRepresentation;
import br.com.igorventurelli.ciandt.dto.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public UserRepresentation index() {
        return new UserRepresentation(
                new UserDTO("Igor", 25, "igor.venturelli@me.com")
        );
    }
}
