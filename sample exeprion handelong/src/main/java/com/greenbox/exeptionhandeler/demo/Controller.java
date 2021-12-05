package com.greenbox.exeptionhandeler.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saeed")
public class Controller {

    @RequestMapping("/say")
    public String  sayhello(@RequestParam("id") int id ){

        if (id==10){
            throw  new saeedexeption("id can no be equal to ",10);
        }
        return " hello mohammad saeid ";
    }
}
