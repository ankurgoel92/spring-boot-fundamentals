package app.boot.controller.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import app.boot.service.ApplicationService;
import app.boot.service.ReleaseService;
import app.boot.service.TicketService;

@Controller
public class BugZillaMVCController {
    @Autowired
    private ApplicationService applicationService;
    @Autowired
    private TicketService ticketService;
    @Autowired
    private ReleaseService releaseService;

    @GetMapping("/applications")
    public String retrieveApplications(Model model) {
        model.addAttribute("applications", applicationService.listApplications());
        return "applications";
    }

    @GetMapping("/tickets")
    public String retrieveTickets(Model model) {
        model.addAttribute("tickets", ticketService.listTickets());
        return "tickets";
    }

    @GetMapping("/releases")
    public String retrieveReleases(Model model) {
        model.addAttribute("releases", releaseService.listReleases());
        return "releases";
    }
}
