package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/api/v1/auth")
@CrossOrigin("*")
public class HomeController {

   @PostMapping("/register")
   // @GetMapping("register")
    public String firstController()
    {
        return "success Spring";
    }
}
