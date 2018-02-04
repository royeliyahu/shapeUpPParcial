package com.royE.ShapeUp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }


    @RequestMapping("/api")
    public String myAPI(){
        return "Adding a new right triangle:\n<br> http://localhost:8081/rightTriangle" +
                "\n<br>message body:  {\"id\":  = yourUniqueId , \n<br>" +
                "&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  \"firstEdge\":  firstEdgeRealValue , \n<br>" +
                "&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  \"secondEdge\" secondEdgeRealValue }";
    }

}

