package org.zerock.projectmeongmung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class productController {
    @GetMapping("/productMain")
    public String product() {
        return "product/productMain";
    }
}