package org.launchcode.spaday.controllers;

import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm(Model model) {
        model.addAttribute("title", "Add User");
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        model.addAttribute("title", "Add User");
        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());

        if (verify.equals(user.getPassword())) {
            UserData.add(user);
            model.addAttribute("users", UserData.getAll());
            return "user/index";
        } else {
            model.addAttribute("error", "Sorry, passwords do not match!");
            return "user/add";
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

