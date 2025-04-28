package com.example.demo;
import org. springframework.stereotype . Controller ;
import org. springframework .web.bind. annotation . GetMapping ;
import org. springframework .web.bind. annotation . RequestMapping ;
import org. springframework .web.bind. annotation . ResponseBody ;
@Controller
@RequestMapping ("/")
public class HelloWorld {
    // RECHTTOE RECHTAAN
    @GetMapping ("/")
    @ResponseBody
    public String index () {
        int calculation = 696969696;
        return "HIIII world342oi3jo1rd";
    }
}