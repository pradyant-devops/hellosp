package com.example.hellosp;


import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  

public class helloworldcontroller {

    @RequestMapping("/")  
public String hello()   
{  
return "Hello World";  
}  
}