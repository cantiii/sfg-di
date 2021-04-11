package hu.pz.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Helloka World!");

        return "Hi Folks!";
    }
}
