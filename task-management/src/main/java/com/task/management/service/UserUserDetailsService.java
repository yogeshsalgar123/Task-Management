package com.task.management.service;



import com.task.management.entities.User;
import com.task.management.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Collection;


@Service
public class UserUserDetailsService implements UserDetailsService {
    @Autowired private UserRepo userRepository;
    public UserUserDetailsService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws
            UsernameNotFoundException {
        User user = userRepository.findByUsernameOrEmail(usernameOrEmail,
                usernameOrEmail);


        return new com.task.management.payload.UserDetails(user);
    }

}