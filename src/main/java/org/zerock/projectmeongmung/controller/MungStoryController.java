package org.zerock.projectmeongmung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mungstory")
public class MungStoryController {

    // 기본적인 soshospitallist.html 템플릿을 반환
    @GetMapping
    public String soshospitallist() {
        return "mungStoryHtml/storyboard";
    }

}