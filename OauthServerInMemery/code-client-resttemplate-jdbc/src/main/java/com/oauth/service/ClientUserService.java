package com.oauth.service;

import com.oauth.dao.ClientUserRepositories;
import com.oauth.domain.ClientUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientUserService {

    @Autowired
    private ClientUserRepositories repositories;

    public void updateClientUser(ClientUser clientUser){
        Optional<ClientUser> userById = repositories.findById(clientUser.getId());
        if(userById.isPresent()){
            repositories.save(clientUser);
        }
    }
}
