package com.example.gymwebsite.service;

import com.example.gymwebsite.entity.ContactMessage;
import com.example.gymwebsite.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageService {

    @Autowired
    private ContactMessageRepository contactMessageRepository;

    // Méthode pour enregistrer un message
    public ContactMessage saveMessage(ContactMessage message) {
        return contactMessageRepository.save(message);
    }
}
