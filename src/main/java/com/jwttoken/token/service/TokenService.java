package com.jwttoken.token.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.jwttoken.token.entity.User;
import org.springframework.stereotype.Component;

@Component
public class TokenService {

    public String getToken(User user) {
        String token= JWT.create().withAudience(String.valueOf(user.getId()))
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}
