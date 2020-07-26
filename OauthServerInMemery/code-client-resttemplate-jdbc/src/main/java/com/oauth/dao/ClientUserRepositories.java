package com.oauth.dao;

import com.oauth.domain.ClientUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientUserRepositories extends JpaRepository<ClientUser, Long> {
    ClientUser findOneByUsername(String username);
}
