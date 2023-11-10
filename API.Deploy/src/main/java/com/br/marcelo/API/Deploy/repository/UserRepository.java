package com.br.marcelo.API.Deploy.repository;

import com.br.marcelo.API.Deploy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByAccountNumber(String accountNumber);

}
