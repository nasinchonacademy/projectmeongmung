package org.zerock.projectmeongmung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/game_list")
public class GameController {

    @GetMapping
    public String game_list(Model model){
        return "game/game_list";
    }
}
