package org.zerock.projectmeongmung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.zerock.projectmeongmung.entity.MungStory;
import org.zerock.projectmeongmung.entity.User;
import org.zerock.projectmeongmung.service.MyPageService;
import org.zerock.projectmeongmung.service.UserDetailService;

import java.util.List;

@Controller
public class MyPageController {

    @Autowired
    private MyPageService myPageService;
    @Autowired
    private UserDetailService userDetailService;


    @GetMapping("/mypage")
    public String getMyPage(Authentication authentication, Model model) {
        String username = authentication.getName();
        User user = userDetailService.loadUserByUsername(username);

        // 좋아요한 스토리 가져오기
        List<MungStory> likedStories = myPageService.getLikedStories(user);
        model.addAttribute("likedStories", likedStories);

        // 젤리 포인트 가져오기
        int jelly = user.getJellypoint();
        model.addAttribute("jelly", jelly);

        List<MungStory> writtenStories = myPageService.getWrittenStories(user);
        model.addAttribute("writtenStories", writtenStories);

        return "mypage/mypage";
    }

}
