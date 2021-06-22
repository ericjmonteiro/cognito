package com.example.demo.controller;
import java.security.Principal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class DemoController {

  @GetMapping
  public String teste(Principal user) {
    return "User: " + user.getName() + " logado";
  }
}
