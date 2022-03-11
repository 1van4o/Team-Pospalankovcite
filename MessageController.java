package com.example.demo.controller;

import com.example.demo.dto.MessageDto;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/astronaut/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping(value = "/encrypt")
    public MessageDto encription(@RequestBody MessageDto dto){
        return messageService.encrypt(dto.getText());
    }

    @PostMapping(value = "/decrypt")
    public MessageDto decription(@RequestBody MessageDto dto){
        return messageService.decrypt(dto.getText());
    }
}
