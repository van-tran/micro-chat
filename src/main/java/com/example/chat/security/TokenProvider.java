package com.example.chat.security;

import com.example.chat.problem.RuntimeProblem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Objects;

@Component
@Slf4j
public class TokenProvider {

//    private final UserService userService;

//    public TokenProvider(UserService userService) {
//        this.userService = userService;
//    }

    public TokenProvider(){

    }

    public Authentication getAuthentication(String token) {
        var authorities = Collections.singletonList(new SimpleGrantedAuthority(UserRole.USER.name()));
        var principal = new org.springframework.security.core.userdetails.User(String.valueOf(0), "", authorities);
        return new UsernamePasswordAuthenticationToken(principal, token, authorities);
    }

    public boolean validateToken(String authToken) {
        return Objects.nonNull(authToken);
    }
}
