package com.br.marcelo.API.Deploy.service;

import com.br.marcelo.API.Deploy.model.User;

public interface UserService {
    User findById(Long id);
    User create(User user);

}
