package org.zerock.projectmeongmung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/soshospitallist")
public class SosBoardController {

    @GetMapping({"", "/"})
    public String meongmung() {
        return "mungSosHtml/soshospitallist"; // soshospitallist.html 템플릿을 반환
    }

    @GetMapping("/sosqnaboard")
    public String sosqnaboard() {
        return "mungSosHtml/sosqnaboard";
    }

    @GetMapping("/sosqnaedit")
    public String sosqnaedit() {
        return "mungSosHtml/sosqnaedit";
    }

    @GetMapping("/sosqnalist")
    public String sosqnalist() {
        return "mungSosHtml/sosqnalist";
    }

    @GetMapping("/sosqnawirte")
    public String sosqnawirte() {
        return "mungSosHtml/sosqnawirte";
    }

    @GetMapping("/vatprofileboard")
    public String vatprofileboard() {
        return "mungSosHtml/vatprofileboard";
    }

    @GetMapping("/vatprofilelist")
    public String vatprofilelist() {
        return "mungSosHtml/vatprofilelist";
    }

}
