package com.example.demo;
import org. springframework.stereotype . Controller ;
import org. springframework .web.bind. annotation . GetMapping ;
import org. springframework .web.bind. annotation . RequestMapping ;
import org. springframework .web.bind. annotation . ResponseBody ;
@Controller
@RequestMapping ("/")
public class HelloWorld {
    // RECHTTOE RECHTAAN
    // adding 6
    @GetMapping ("/")
    @ResponseBody
    public String index () {
        int calculation = 2;
        // new comment
        return "do this do that 2";


        // Add 1
        // Add 2
        // Add 3
        // Add 4
        // Add 5
    }
}