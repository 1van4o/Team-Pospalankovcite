package com.example.demo.service;

import com.example.demo.dto.MessageDto;

import java.util.List;

public interface MessageService {
    MessageDto encrypt(String text);
    MessageDto decrypt(String text);
    List<MessageDto> save();
}
