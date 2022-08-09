package one.digitalinnovation.parking.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.lang.annotation.Retention;

@RestController
@RequestMapping("/")
@ApiIgnore
public class HelloController {
    @GetMapping
    public String hello(){
        return "Hello DIO.Dev bem vindos..";
    }
}
