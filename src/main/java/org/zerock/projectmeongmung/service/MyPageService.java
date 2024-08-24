package org.zerock.projectmeongmung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.projectmeongmung.entity.MungStory;
import org.zerock.projectmeongmung.entity.StoryLike;
import org.zerock.projectmeongmung.entity.User;
import org.zerock.projectmeongmung.repository.StoryLikeRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MyPageService {

    @Autowired
    private StoryLikeRepository storyLikeRepository;

    public List<MungStory> getLikedStories(User user) {
        List<StoryLike> storyLikes = storyLikeRepository.findByUser(user);
        return storyLikes.stream()
                .map(StoryLike::getStorySeq)
                .collect(Collectors.toList());
    }
}
