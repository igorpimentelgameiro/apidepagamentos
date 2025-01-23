package com.igorpimentelgameiro.payment_system.service;

import com.igorpimentelgameiro.payment_system.dto.UserResponse;
import com.igorpimentelgameiro.payment_system.entity.User;
import com.igorpimentelgameiro.payment_system.repository.UserRepository;
import com.igorpimentelgameiro.payment_system.util.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserResponse registerUser(User user){
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("This email already exists");
        }else{
            String encodedPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(encodedPassword);



            String randomCode = RandomString.generateRandomString(64);
            user.setVerificationCode(randomCode);
            user.setEnabled(false);

            User savedUser = userRepository.save(user);

            UserResponse userResponse = new UserResponse(
                    savedUser.getId(),
                    savedUser.getName(),
                    savedUser.getEmail(),
                    savedUser.getPassword());

            return userResponse;
        }
    }
}
