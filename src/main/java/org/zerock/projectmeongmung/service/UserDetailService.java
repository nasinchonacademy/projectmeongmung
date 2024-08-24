package org.zerock.projectmeongmung.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.zerock.projectmeongmung.entity.User;
import org.zerock.projectmeongmung.repository.UserRepository;

@RequiredArgsConstructor
@Service
//스프링 시큐리티에서 사용자 정보를 가져오는 인터페이스
public class UserDetailService {

    private final UserRepository userRepository;

}
