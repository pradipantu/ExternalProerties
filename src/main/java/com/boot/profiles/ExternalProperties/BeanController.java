package com.boot.profiles.ExternalProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {

    @Autowired
    MyBean myBean;
    @GetMapping(path="/")
    public void getName(){
        System.out.println(myBean.getName());
    }
}
