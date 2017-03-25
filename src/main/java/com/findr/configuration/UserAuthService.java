package com.findr.configuration;


import com.findr.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;



@Component
public class UserAuthService implements UserDetailsService {


    @Autowired
    private UserRepo userRepo;

    @Autowired
    public UserAuthService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        com.findr.model.User user = this.userRepo.findByEmail(email);

        return new User(user.getEmail(),user.getPassword(),AuthorityUtils.createAuthorityList("ROLE_USER"));

    }

}
