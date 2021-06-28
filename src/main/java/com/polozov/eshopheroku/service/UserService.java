package com.polozov.eshopheroku.service;

import com.polozov.eshopheroku.domain.User;
import com.polozov.eshopheroku.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    boolean save(UserDto userDto);

    List<UserDto> getAll();

    User findByName(String name);

    void updateProfile(UserDto dto);

    void save(User user);

    boolean activateUser(String activateCode);
}
