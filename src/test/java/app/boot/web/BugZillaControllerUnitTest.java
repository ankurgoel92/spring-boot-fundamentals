package app.boot.web;

import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import app.boot.controller.rest.BugZillaRestController;
import app.boot.service.ApplicationService;
import app.boot.service.TicketService;

@RunWith(SpringRunner.class)
@WebMvcTest(BugZillaRestController.class)
public class BugZillaControllerUnitTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    ApplicationService applicationService;

    @MockBean
    TicketService ticketService;

    @Test
    public void getAllApplications() throws Exception {
        
        mockMvc.perform(get("/rest/api/applications/"))
               .andExpect(status().isOk())
               .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
               .andExpect(content().json("[]"));

        verify(applicationService, times(1)).listApplications();
    }

    @Test
    public void getAllTickets() throws Exception {
        
        mockMvc.perform(get("/rest/api/tickets/"))
               .andExpect(status().isOk())
               .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
               .andExpect(content().json("[]"));

        verify(ticketService, times(1)).listTickets();
    }
}
