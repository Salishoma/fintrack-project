package com.fintrack.fintrackproject;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FinTrackController {

    @GetMapping("/")
    @PreAuthorize("hasAuthority('fintrack-java-c')")
    public String sayHello(){
        return "Hello";
    }
}
