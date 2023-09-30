package com.example.chat.service.conversation;

import com.example.converstaion.api.ConversationsApiDelegate;
import com.example.converstaion.service.api.dto.Conversation;
import com.example.converstaion.service.api.dto.Result;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class ConversationService implements ConversationsApiDelegate {


    // Initializing instance of Logger for Service
    private static final Logger logger = LoggerFactory.getLogger(ChatServiceImpl.class);
    @Override
    public ResponseEntity<Result> newConversation(Conversation data) {



        return ConversationsApiDelegate.super.newConversation(data);
    }
}
