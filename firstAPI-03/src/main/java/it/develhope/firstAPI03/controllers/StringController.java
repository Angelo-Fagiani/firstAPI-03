package it.develhope.firstAPI03.controllers;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.constraints.NotBlank;

@RestController
@Validated
public class StringController {


    @NotBlank(message = "Mandatory")
    String s1;
    String s2;

    @GetMapping(value = "/strings")
    public String getConcatString(@Validated @RequestParam String s1, @RequestParam(required = false) String s2) {
        String concat = s1.concat(s2);
        return concat;
    }


}




