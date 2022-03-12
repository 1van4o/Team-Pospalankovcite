package com.example.demo.service.impl;

import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private EntityManager entityManager;

    public MessageServiceImpl(){

    }
    @Override
    public String encrypt(String text) {
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
        return encrypted_help;
    }

    @Override
    public String decrypt(String text)  {
        String decrypted_help = "";

        for (int i = 0; i < text.length(); i = i + 3){
            int temp = (int) text.charAt(i) - 15;
            decrypted_help += Character.toString(temp);
        }
        return decrypted_help;

    }

}
