package com.flashcardsspring.Flashcards.services;

import com.flashcardsspring.Flashcards.domain.User;
import com.flashcardsspring.Flashcards.repositories.UserRepository;
import com.flashcardsspring.Flashcards.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new ObjectNotFoundException("Usuário Não Encontrado! Id: " + id);
        }
        return user.get();
    }
}
