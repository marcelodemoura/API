package com.br.marcelo.API.Deploy.service;

import com.br.marcelo.API.Deploy.model.User;
import com.br.marcelo.API.Deploy.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(NoSuchElementException::new );
    }

    @Override
    public User create(User user) {
        if (userRepository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already exists.");

        }
        return userRepository.save(user );
    }

}
