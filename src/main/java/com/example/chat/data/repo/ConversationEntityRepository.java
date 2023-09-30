package com.example.chat.data.repo;

import com.example.chat.data.entity.ConversationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConversationEntityRepository extends JpaRepository<ConversationEntity, UUID> {
}