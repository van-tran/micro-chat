package com.example.chat.data.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "conversation")
public class ConversationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    String conversationCode;


}