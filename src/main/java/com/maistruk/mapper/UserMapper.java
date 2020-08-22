package com.maistruk.mapper;

import org.springframework.stereotype.Component;

import com.maistruk.model.User;

@Component
public class UserMapper {

    public static User mapUserRequest2User(User request) {
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());

        return user;
    }
}