package com.boardproject.myrest.controller;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {
    @GetMapping
    public String index(){
        return "index";
    }
}
