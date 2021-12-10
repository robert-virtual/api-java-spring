package com.example.springrestapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/users")
public class UsersController {
    
    @GetMapping()
    public @ResponseBody String all() {
        return "Users endpoint";
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public String get( @PathVariable int id) {
        return "User " + id;
    }
}
