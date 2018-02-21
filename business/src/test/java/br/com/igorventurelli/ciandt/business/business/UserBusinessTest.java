package br.com.igorventurelli.ciandt.business.business;

import br.com.igorventurelli.ciandt.business.configuration.BusinessModuleConfiguration;
import br.com.igorventurelli.ciandt.dto.dto.UserDTO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BusinessModuleConfiguration.class})
public class UserBusinessTest {

    @Autowired
    private UserBusiness business;

    @Test
    public void testIndex() {
        UserDTO dto = new UserDTO("Igor", 25, "igor.venturelli@me.com");
        Assert.assertEquals(dto, business.index());
    }
}
