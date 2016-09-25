package com.example.repository;

import com.example.model.CustomUserDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends MongoRepository<CustomUserDetails, String> {

    CustomUserDetails findByUsername(String username);
}
