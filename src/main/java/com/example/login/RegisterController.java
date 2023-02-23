package com.example.login;

import com.example.login.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    @RequestMapping("/registerPage")
    public String register(){

        return "registerPage";
    }

    @PostMapping ("/registerPage")
    public String registerPeople(@ModelAttribute User user, Model model){
        //System.out.println(user.toString());
        model.addAttribute("name",user.getName());
        return "Welcome";
    }
}
