package br.com.igorventurelli.ciandt.service.service.impl;

import br.com.igorventurelli.ciandt.dto.dto.UserDTO;
import br.com.igorventurelli.ciandt.service.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO index() {
        return new UserDTO("Igor", 25, "igor.venturelli@me.com");
    }
}
