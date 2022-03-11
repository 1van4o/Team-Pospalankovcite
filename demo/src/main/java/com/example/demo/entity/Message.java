package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "messages", schema = "PUBLIC")
@NamedQueries({
        @NamedQuery(name = "Message.decrypt", query = "SELECT s FROM Message s"),
})
public final class Message {
    public Message() {}

    public Message(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @Column(name = "student_id", updatable = false, nullable = false)
    private Long id;

    @Column
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
