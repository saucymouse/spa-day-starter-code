package org.launchcode.spaday.controllers;

import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm(Model model, @ModelAttribute User user) {
        model.addAttribute("title", "Add User");
        //TODO attributeName is optional
        model.addAttribute(new User());
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute @Valid User user, Errors errors) {
        model.addAttribute("title", "Add User");

        if (errors.hasErrors()) {
            return "user/add";
        } else {
            UserData.add(user);
            model.addAttribute("users", UserData.getAll());
            return "user/index";
        }

    }

    @GetMapping("detail/{userId}")
    public String displayUserDetail(Model model, @PathVariable int userId) {
        User user = UserData.getById(userId);
        model.addAttribute("title", "User Detail");
        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("dateCreated", user.getDateCreated());
        return "user/detail";
    }

}

