package com.application.admnistration.controller;

import com.application.admnistration.entity.CollegeAdmnistration;
import com.application.admnistration.service.CollegeAdmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collegeAdm")
@RequiredArgsConstructor
public class CollegeAdmController {
   private final CollegeAdmService collegeAdmService;

    @PutMapping(
            value = "/refresh",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CollegeAdmnistration updateQuantities(){
        return collegeAdmService.updateQuantities();
    }

    @GetMapping(
            value = "/information",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CollegeAdmnistration getCollegeAdmnistrationInformation(){
        return collegeAdmService.getCollegeAdmnistrationInformation();
    }
}
