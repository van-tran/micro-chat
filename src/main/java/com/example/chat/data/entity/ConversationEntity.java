package com.example.chat.data.entity;

import com.example.chat.constants.ConversationStatus;
import com.example.chat.constants.ConversationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "conversation")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConversationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    String conversationID;

    ConversationType type;

    ConversationStatus status;

    LocalDateTime createdAt;

    LocalDateTime lastModifiedAt;

}