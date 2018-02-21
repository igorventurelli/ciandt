package br.com.igorventurelli.ciandt.business.business.impl;

import br.com.igorventurelli.ciandt.business.business.UserBusiness;
import br.com.igorventurelli.ciandt.dto.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserBusinessImpl implements UserBusiness {

    @Override
    public UserDTO index() {
        return new UserDTO("Igor", 25, "igor.venturelli@me.com");
    }
}
