package br.com.igorventurelli.ciandt.service.service.impl;

import br.com.igorventurelli.ciandt.business.business.UserBusiness;
import br.com.igorventurelli.ciandt.dto.dto.UserDTO;
import br.com.igorventurelli.ciandt.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBusiness business;

    @Override
    public UserDTO index() {
        return business.index();
    }
}
