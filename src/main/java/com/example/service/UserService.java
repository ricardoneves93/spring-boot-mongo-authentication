package com.example.service;

import com.example.model.CustomUserDetails;
import com.example.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserDetailsRepository userDetailsRepository;

    @Autowired
    public UserService(UserDetailsRepository userDetailsRepository) {

        this.userDetailsRepository = userDetailsRepository;
    }

    public CustomUserDetails save(CustomUserDetails customUserDetails) {
        return this.userDetailsRepository.insert(customUserDetails);
    }
}
