package com.example.dalsiapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// localhost:8080/markets
// localhost:8080/ -> redirect na localhost:8080/markets

@Controller
public class MarketController {

    @GetMapping("/")
    public String index() {
        return "redirect:/markets";
    }

    @GetMapping("/markets")
    public String getMarketPage() {
        return "markets";
    }

}
