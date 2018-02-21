package br.com.igorventurelli.ciandt.service.service;

import br.com.igorventurelli.ciandt.dto.dto.UserDTO;
import br.com.igorventurelli.ciandt.service.configuration.ServiceModuleConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ServiceModuleConfiguration.class})
public class UserServiceTest {

    @Autowired
    private UserService service;

    @Test
    public void indexTest() {
        UserDTO dto = new UserDTO("Igor", 25, "igor.venturelli@me.com");
        Assert.assertEquals(dto, service.index());
    }
}
