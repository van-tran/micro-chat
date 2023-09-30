package com.example.chat.dto;

import com.example.chat.constants.ConversationStatus;
import com.example.chat.constants.ConversationType;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * A DTO for the {@link com.example.chat.data.entity.ConversationEntity} entity
 */

public record ConversationEntityDto(UUID id,
                                    String conversationID,
                                    ConversationType type,
                                    ConversationStatus status,
                                    LocalDateTime createdAt,
                                    LocalDateTime lastModifiedAt) implements Serializable {
}