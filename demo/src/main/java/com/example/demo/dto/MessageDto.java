package com.example.demo.dto;

public class MessageDto {
    private String text;

    public MessageDto() {}

    public MessageDto(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
