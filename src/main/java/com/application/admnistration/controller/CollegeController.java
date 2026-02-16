package com.application.admnistration.controller;

import com.application.admnistration.entity.CollegeAdmnistration;
import com.application.admnistration.service.CollegeService;
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
   private final CollegeService collegeService;

    @PutMapping(
            value = "/refresh",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CollegeAdmnistration updateQuantities(){
        return collegeService.updateQuantities();
    }

    @GetMapping(
            value = "/information",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public CollegeAdmnistration getCollegeAdmnistrationInformation(){
        return collegeService.getCollegeAdmnistrationInformation();
    }
}
