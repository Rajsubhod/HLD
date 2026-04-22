package org.rejeo.hld.auth.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    @Value("${jwt.secret}")
    private String SECRET;
    private static final long EXPIRATION_TIME = 864_000_000;

    
}