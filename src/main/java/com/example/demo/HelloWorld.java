package com.example.demo;
import org. springframework.stereotype . Controller ;
import org. springframework .web.bind. annotation . GetMapping ;
import org. springframework .web.bind. annotation . RequestMapping ;
import org. springframework .web.bind. annotation . ResponseBody ;
@Controller
@RequestMapping ("/")
public class HelloWorld {
    @GetMapping ("/")
    @ResponseBody
    public String index () {
        int calculation = 1;
        boolean yessir = calculation * 3 == 5;
        return "HIIII world342oi3jo1rd";
    }
}