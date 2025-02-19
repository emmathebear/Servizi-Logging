package com.example.servizi_logging.controller;

import com.example.servizi_logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    private BasicService basicService;

    Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/")
    public String welcome() {
        return basicService.welcome();
    }

    @GetMapping("/exp")
    public int getExponent(@RequestParam int n1, @RequestParam int n2) {
        return basicService.getExponent(n1, n2);
    }

    @GetMapping("/get-errors")
    public void throwException() {
      basicService.throwException();
    }
}
