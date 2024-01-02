package com.tokoapi.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.tokoapi.example.model.User;

@RepositoryRestResource
public interface UserRepo extends JpaRepository<User, Long>{
    
}
