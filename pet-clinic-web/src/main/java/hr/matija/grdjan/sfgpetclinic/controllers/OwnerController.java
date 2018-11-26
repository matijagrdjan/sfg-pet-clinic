package hr.matija.grdjan.sfgpetclinic.controllers;

import hr.matija.grdjan.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"})
@Controller
public class OwnerController {
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    private final OwnerService ownerService;

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owner/index";
    }

    @RequestMapping("/find")
    public String findOwners(){
        return "notimplemented";
    }
}
