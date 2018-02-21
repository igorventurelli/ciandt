package br.com.igorventurelli.ciandt.controller.endpoint;

import br.com.igorventurelli.ciandt.controller.configuration.ControllerModuleConfiguration;
import br.com.igorventurelli.ciandt.controller.representation.UserRepresentation;
import br.com.igorventurelli.ciandt.dto.dto.UserDTO;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ControllerModuleConfiguration.class})
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testIndex() throws Exception {
        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setUser(new UserDTO("Igor", 25, "igor.venturelli@me.com"));
        final String json = new Gson().toJson(userRepresentation);

        this.mockMvc.perform(
                get("/")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(json));
    }
}
