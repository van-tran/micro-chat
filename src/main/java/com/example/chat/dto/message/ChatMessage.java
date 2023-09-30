package com.example.chat.dto.message;

import lombok.Data;

@Data
public class ChatMessage{
	private Receiver receiver;
	private Sender sender;
	private Message message;
}