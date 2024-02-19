package com.nobrand.springb1oauth2.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "Guest user"),
    USER("ROLE_USER", "Common enrolled user");

    private final String key;
    private final String title;

}
