package org.factoriaf5.store.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    @GetMapping("/health")
    public String check() {
        return "Hello! I'm a server.";
    }
        }