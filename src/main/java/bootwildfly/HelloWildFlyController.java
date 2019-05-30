package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }

   @RequestMapping("hello2")
    public String sayHelloAgain(){
        return ("Hello, SpringBoot on Wildfly by Madhu");
    }
}	
