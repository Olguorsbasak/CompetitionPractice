package com.olgu.competitionpractice.utility;

import com.olgu.competitionpractice.repository.UserRepository;
import com.olgu.competitionpractice.repository.entitiy.User;
import org.springframework.stereotype.Component;/**başladığında ekleyen giriş yaptığında görünen */

import java.util.Optional;
@Component
public class AdminImplemantation { /** veri tabanında bir admin olmadığından buna ihtiyacımız var,uygulama ilk ayağa kalktığında buraya bakar.*/
    private final UserRepository userRepository;

    public AdminImplemantation(UserRepository userRepository){
        this.userRepository = userRepository;
        Optional<User> user = this.userRepository.findByUsernameAndPassword("admin","admin");
        /**böyle bir kullanıcı var mı yok */
        if(user.isEmpty())
            this.userRepository.save(User.builder()
                    .username("admin")
                    .password("admin123")
                    .username("Manager")
                    .build());
    }
}
