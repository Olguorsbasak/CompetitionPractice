package com.olgu.competitionpractice.repository;

import com.olgu.competitionpractice.repository.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User,Long>{
    Optional<User> findByUsernameAndPassword(String username, String password);
    /**
     * !!! DİKKAT !!!
     * Eğer Optional ile sonuç dönmek istiyorken, tek bir değer yerine veritabanından bir liste döner ise
     * exception fırlatır ve akışınızı bozar. tek kayıt geldiğinden emin olmadığınız yerlerde kullanırken dikkatli olun.
     * @param username
     * @return
     */
    Optional<User> findByUsername(String username);
}
