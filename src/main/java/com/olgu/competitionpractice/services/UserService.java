package com.olgu.competitionpractice.services;

import com.olgu.competitionpractice.dto.request.DoLoginDto;
import com.olgu.competitionpractice.repository.UserRepository;
import com.olgu.competitionpractice.repository.entitiy.User;
import com.olgu.competitionpractice.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends ServiceManager<User,Long> {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    public Optional<User> doLogin(DoLoginDto doLoginDto) {
        return userRepository.findByUsernameAndPassword(doLoginDto.getUsername(), doLoginDto.getPassword());
    }
}
