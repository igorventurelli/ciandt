package br.com.igorventurelli.ciandt.controller.representation;

import br.com.igorventurelli.ciandt.dto.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRepresentation {

    private UserDTO user;
}
