package com.example.gymwebsite.controller;

import com.example.gymwebsite.entity.ContactMessage;
import com.example.gymwebsite.service.ContactMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:4200") // Assurez-vous que l'URL est correcte en fonction de votre configuration Angular
public class ContactMessageController {

    @Autowired
    private ContactMessageService contactMessageService;

    // Endpoint pour envoyer un message de contact
    @PostMapping("/send")
    public ResponseEntity<ContactMessage> sendMessage(@RequestBody ContactMessage message) {
        ContactMessage savedMessage = contactMessageService.saveMessage(message);
        return new ResponseEntity<>(savedMessage, HttpStatus.CREATED);
    }
}
