package com.olgu.competitionpractice.services;

import com.olgu.competitionpractice.dto.request.DoLoginRequestDto;
import com.olgu.competitionpractice.dto.request.RegisterRequestDto;
import com.olgu.competitionpractice.mapper.UserMapper;
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

    public Optional<User> doLogin(DoLoginRequestDto doLoginRequestDto) {
        return userRepository.findByUsernameAndPassword(doLoginRequestDto.getUsername(), doLoginRequestDto.getPassword());
    }

    /**
     *
     * @param dto
     * @return Eğer kullanıcı kayıtlı ise kayıt yapılamayıp false döner.
     */
    public boolean register(RegisterRequestDto dto){
        Optional<User> user = userRepository.findByUsername(dto.getUsername());
        if(user.isPresent()) return false;
        /*
        userRepository.save(User.builder()
                        .adsoyad(dto.getAdsoyad())
                        .username(dto.getUsername())
                        .password(dto.getPassword())
                .build());
                */
        userRepository.save(UserMapper.INSTANCE.toUser(dto));
        return true;
    }


}
