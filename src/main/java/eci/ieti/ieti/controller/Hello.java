package eci.ieti.ieti.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {

    @GetMapping
    public ResponseEntity<String> hi(){
        return ResponseEntity.ok("Hi!");
    }

}
