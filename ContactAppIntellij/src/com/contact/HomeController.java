package com.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @Autowired
    MainService service;

    @RequestMapping("/")
    public String Home() {

        return "home";
    }

    @RequestMapping("openaddcontact")
    public String Add(Model m) {

        AddBean bean = new AddBean();
        m.addAttribute("add", bean);
        return "addcontact";
    }


    @RequestMapping("addcontact")
    public String Addcontact(@ModelAttribute("add") @Validated AddBean bean, BindingResult result, Model m) {
        if (result.hasErrors()) {
            return "addcontact";
        } else {
            String msg = service.Addcontact(bean);
            if (msg.equals(Constants.SUCCESS))
                m.addAttribute("msg", "you have succesfully uploaded the contact in database");
            return "success";
        }
    }
}