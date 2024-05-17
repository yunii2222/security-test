package com.ohigraffers.securitytest.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class TokenDto {
    private final String accessToken;
    private final String refreshToken;

    public static TokenDto of(String reIssuedAccessToken, String reIssuedRefreshToken) {
        return new TokenDto(reIssuedAccessToken, reIssuedRefreshToken);
    }
}
