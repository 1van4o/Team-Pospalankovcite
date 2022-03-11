package com.example.demo.service.impl;

import com.example.demo.dto.MessageDto;
import com.example.demo.entity.Message;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private EntityManager entityManager;


    @Override
    public MessageDto encrypt(String text) {
        MessageDto encrypted = new MessageDto();
        String encrypted_help = "";
        //for (int i = 0, j = 0; i < text.length(); i = i + 3, j++) encrypted_help += text.indexOf(i);
        for (int i = 0; i < text.length(); i++){
            int temp = (int) text.charAt(i) + 15;
            encrypted_help += Character.toString(temp);
            temp = (int) text.charAt(i) - 15;
            encrypted_help += Character.toString(temp);
            temp = (int) text.charAt(i) - 10;
            encrypted_help += Character.toString(temp);
        }
        encrypted.setText(encrypted_help);
        return encrypted;
    }

    @Override
    public MessageDto decrypt(String text) {
        MessageDto decrypted = new MessageDto();
        String decrypted_help = "";

        for (int i = 0; i < text.length(); i = i + 3){
            int temp = (int) text.charAt(i) - 15;
            decrypted_help += Character.toString(temp);
        }
        decrypted.setText(decrypted_help);
        return decrypted;
    }

    @Override
    public List<MessageDto> save() {
        return null;
    }
}
